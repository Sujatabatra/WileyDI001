package com.sujata.demo;

import com.sujata.exception.AgeException;

public class Employee {

	private String name;
	private int age;

	public Employee() {
		
	}
	public Employee(String name, int age)throws AgeException {

		if (age >= 18 && age <= 60) {
			this.name = name;
			this.age = age;
		}
		else
			throw new AgeException("Age must be between 18 to 60");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws AgeException {
		if (age >= 18 && age <= 60) {
			this.age = age;
		}
		else
			throw new AgeException("Age must be between 18 to 60");
	}

	public void display() {
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Age : " + age);
	}
}
