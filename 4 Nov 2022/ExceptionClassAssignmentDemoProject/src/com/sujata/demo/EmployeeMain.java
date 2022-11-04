package com.sujata.demo;

import java.util.Scanner;

import com.sujata.exception.AgeException;
import com.sujata.exception.NameException;

public class EmployeeMain {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter total number of employees : ");
			int total = scanner.nextInt();

			EmployeeList employeeList = new EmployeeList(total);

			for (int index = 0; index < total; index++) {
				Employee emp = new Employee();

				System.out.println("Enter Employee Name : ");
				emp.setName(scanner.next());
				System.out.println("Enter Employee Age : ");
				emp.setAge(scanner.nextInt());

				employeeList.inputEmployee(emp, index);
			}
			employeeList.displayEmployees();
		} catch (AgeException exception) {
			System.out.println(exception.getMessage());
		} catch (NameException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Total No of employee cannot be negative");
		}
		catch(Exception e) {
			System.out.println("OOPS Something went wrong, please try after sometime!");
		}

	}
}
