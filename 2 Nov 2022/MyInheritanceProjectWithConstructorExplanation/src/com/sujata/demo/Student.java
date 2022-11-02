package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;

	public Student() {
		//implicit call to the base class default constructor (Base Class: Object)
		System.out.println("Hi I am student class default constructor");
	}
	public void inputStudentDetails(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayStudent() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		
	}
}
