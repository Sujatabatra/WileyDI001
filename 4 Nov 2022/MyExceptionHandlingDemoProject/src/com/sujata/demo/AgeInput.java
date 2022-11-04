package com.sujata.demo;

public class AgeInput {

	private int age;
	
	public AgeInput() {
		
	}

	public AgeInput(int age) throws AgeCheckedException {
		if(age<18)
			throw new AgeCheckedException("Age must be greater than 18");
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<18)
			throw new AgeUncheckedException("Age should not be less than 18");
		this.age = age;
	}
	
	
}
