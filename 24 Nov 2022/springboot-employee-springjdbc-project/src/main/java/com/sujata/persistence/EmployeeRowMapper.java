package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int eid = resultSet.getInt("EMPLOYEEID");
		String name = resultSet.getString("NAME");
		String desig = resultSet.getString("DESIGNATION");
		String deptt = resultSet.getString("DEPARTMENT");
		double sal = resultSet.getDouble("SALARY");
		LocalDate doj = resultSet.getDate("DOJ").toLocalDate();

		Employee employee = new Employee(eid, name, desig, deptt, sal, doj);
		return employee;
	}

}
