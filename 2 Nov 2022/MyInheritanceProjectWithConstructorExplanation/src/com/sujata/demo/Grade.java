package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	public Grade() {
		//implicit call to the base class default constructor (Base Class: Marks)
		/*
		 * to call the base class constructor use "super" keyword
		 */
		super(0,0,0);
		System.out.println("Hi I am Grade class default constructor");
	}
	
	
	public Grade(int marks1, int marks2, int marks3) {
		super(marks1, marks2, marks3);
	}


	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}
	public String getGrade() {
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	public void displayAllDetails() {
		displayStudentWithyMarks();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
	
}
