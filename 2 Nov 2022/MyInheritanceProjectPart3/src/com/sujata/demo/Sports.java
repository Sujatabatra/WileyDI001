package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;
	
	/*
	 * overloaded
	 */
	public void input(int rollNo,String name,String sportsName) {
		input(rollNo, name);
		this.sportsName=sportsName;
	}
	
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Sports Name : "+sportsName);
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	
	
}
