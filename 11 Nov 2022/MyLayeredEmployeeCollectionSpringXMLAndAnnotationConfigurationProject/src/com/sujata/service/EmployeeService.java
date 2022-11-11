package com.sujata.service;

import java.util.Collection;
import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeePaySlip;

public interface EmployeeService {

	Collection<Employee> getAllEmployees();
	
	Employee searchEmployeeById(int id);
	
	boolean addEmployee(Employee employee);
	
	boolean deleteEmployee(int id);
	
	boolean incrementSalary(int id,double increment);
	
	EmployeePaySlip generatePaySlip(int employeeId);
}
