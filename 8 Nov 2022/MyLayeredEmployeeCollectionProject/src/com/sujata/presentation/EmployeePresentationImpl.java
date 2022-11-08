package com.sujata.presentation;

import java.util.Collection;

import com.sujata.entity.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("Employee Management System");
		System.out.println("1. List All Employees");
		System.out.println("2. Exit");
		System.out.println("============================");

	}

	@Override
	public void performMenu(int choice) {
		switch (choice) {
		case 1:
			Collection<Employee> employees=employeeService.getAllEmployees();
			for(Employee emp:employees) {
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!");
			break;
		}

	}

}
