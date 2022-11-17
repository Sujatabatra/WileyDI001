package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySecondJDBCProject {

	public static void main(String args[]) {

		Connection connection=null;
		PreparedStatement preparedStatement;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			System.out.println("Enter Employee ID : ");
			preparedStatement.setInt(1, scanner.nextInt());
			
			System.out.println("Enter Employee Name : ");
			preparedStatement.setString(2, scanner.next());
			
			System.out.println("Enter Employee Designation : ");
			preparedStatement.setString(3, scanner.next());
			
			System.out.println("Enter Employee Department : ");
			preparedStatement.setString(4, scanner.next());
			
			System.out.println("Enter Employee Salary : ");
			preparedStatement.setDouble(5, scanner.nextDouble());
			
			//DML : executeUpdate() , which will int (count of no of rows manipulated by the query)
			int rows=preparedStatement.executeUpdate();
			
//			3. Process The result
			if(rows>0)
				System.out.println("Employee added");
			else
				System.out.println("Employee Not added");
			
		} catch (ClassNotFoundException e) {
			//displaying the complete stack for exceptions
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("Employee Not added");
		}
		finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
