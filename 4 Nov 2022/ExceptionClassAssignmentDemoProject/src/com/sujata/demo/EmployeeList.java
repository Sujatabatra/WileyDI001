package com.sujata.demo;

import com.sujata.exception.NameException;

public class EmployeeList {

	private Employee[] empList;
	private int totalEmployees;

	public EmployeeList(int totalEmployees) {
		super();
		
		this.totalEmployees = totalEmployees;
		empList = new Employee[totalEmployees];
		
		
	}

	public void inputEmployee(Employee employee, int index) throws NameException {

		for (int i = 0; i < index; i++) {
			if (empList[i].getName().equals(employee.getName()))
				throw new NameException("Duplicate name entered");
		}

		empList[index] = employee;
	}

	public void displayEmployees() {
		/*
		 * for each for(datatype variable:array/anycollection){ statements; }
		 */
		for (Employee emp : empList) {
			emp.display();
		}
	}

}
