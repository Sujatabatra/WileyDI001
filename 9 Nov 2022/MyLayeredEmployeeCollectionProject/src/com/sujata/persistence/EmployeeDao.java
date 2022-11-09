package com.sujata.persistence;

import java.util.Collection;
import java.util.List;

import com.sujata.entity.Employee;

/*
 * DAO : Data Access Object : Design Pattern to design persistence layer
 */
public interface EmployeeDao {

	Collection<Employee> getAllRecords();
	Employee searchRecord(int id);
	Employee insertRecord(Employee employee);
	Employee deleteRecord(int id);
}
