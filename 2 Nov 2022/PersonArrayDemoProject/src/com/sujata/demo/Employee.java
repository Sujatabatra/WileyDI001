package com.sujata.demo;

public class Employee extends Person {

	private String designation;
	private String department;
	private double salary;

	public Employee() {

	}

	public Employee(int id, String name, int age, String designation, String department, double salary) {
		super(id, name, age);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Designation : "+designation);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
	}
}
