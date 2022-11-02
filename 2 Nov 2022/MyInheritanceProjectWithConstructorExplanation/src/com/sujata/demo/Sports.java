package com.sujata.demo;

public class Sports extends Student {

	private String sportsName;
	
	public void inputStudentWithSportsInfo(int rollNo,String name,String sportsName) {
		inputStudentDetails(rollNo, name);
		this.sportsName=sportsName;
	}
	
	public void displayStudentWithSportsInfo() {
		displayStudent();
		System.out.println("Sports Name : "+sportsName);
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	
	
}
