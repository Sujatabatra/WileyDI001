package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sujata.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Collection<Employee> getAllRecords() {

		Connection connection = null;
		PreparedStatement preparedStatement;

		Collection<Employee> employeeList = new ArrayList<Employee>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");

			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("EMPLOYEEID");
				String name = resultSet.getString("NAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				double sal = resultSet.getDouble("SALARY");
				LocalDate doj = resultSet.getDate("DOJ").toLocalDate();

				employeeList.add(new Employee(id, name, desig, deptt, sal, doj));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}

	@Override
	public Employee searchRecord(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement;

		Employee employee = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");

			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EMPLOYEEID=?");

			preparedStatement.setInt(1, id);
// resultset is pointing above first row
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int eid = resultSet.getInt("EMPLOYEEID");
				String name = resultSet.getString("NAME");
				String desig = resultSet.getString("DESIGNATION");
				String deptt = resultSet.getString("DEPARTMENT");
				double sal = resultSet.getDouble("SALARY");
				LocalDate doj = resultSet.getDate("DOJ").toLocalDate();

				employee = new Employee(eid, name, desig, deptt, sal, doj);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employee;

	}

	@Override
	public int insertRecord(Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		int rows=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");

			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)");

			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setDouble(5, employee.getEmpSalary());
			preparedStatement.setObject(6, employee.getDateOfJoining());

			rows = preparedStatement.executeUpdate();

			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows;
	}

	@Override
	public int deleteRecord(int id) {

		Connection connection = null;
		PreparedStatement preparedStatement;
		int rows=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");

			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?");

			preparedStatement.setInt(1, id);

			rows = preparedStatement.executeUpdate();

			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows;
	}

	@Override
	public int updateSalary(int id, double increment) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		int rows=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");

			preparedStatement = connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=SALARY+? WHERE EMPLOYEEID=?");

			preparedStatement.setDouble(1, increment);
			preparedStatement.setInt(2, id);

			rows = preparedStatement.executeUpdate();

			return rows;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rows;
	}

}
