package com.sujata.demo;

public class Marks extends Student {

	private int marks1, marks2, marks3;

//	public Marks() {
//		//implicit call to the base class default constructor (Base Class: Student)
//		System.out.println("Hi I am Marks class default constructor");
//	}

	public Marks(int marks1, int marks2, int marks3) {
		//implicit call to the base class default constructor (Base Class: Student)
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public void input(int rollNo, String name, int marks1, int marks2, int marks3) {
		input(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	/*
	 * over riding
	 * 1. function name and signature will be same as that of parent class
	 * 2. while overriding , we can broader the sccope but we can't narrow down the scope of the method
	 * private < default < protected < public
	 */
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Marks1 : " + marks1);
		System.out.println("Marks 2 : " + marks2);
		System.out.println("Marks 3 : " + marks3);

	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

}
