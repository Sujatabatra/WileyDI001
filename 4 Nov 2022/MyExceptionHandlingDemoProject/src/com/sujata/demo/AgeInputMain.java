package com.sujata.demo;

import java.util.Scanner;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		AgeInput ageInput1=new AgeInput();
		System.out.println("Enter Age : ");
		int age=scanner.nextInt();
		ageInput1.setAge(age);
		System.out.println("Age : "+ageInput1.getAge());
		}
		catch(AgeUncheckedException exception) {
			System.out.println("Person is not eligigble for employement");
		}
		
		try {
		System.out.println("Enter One More Age :");
		AgeInput ageInput2=new AgeInput(scanner.nextInt());
		System.out.println("As person age is "+ageInput2.getAge()+" so person is eligible for voting");
		}
		catch(AgeCheckedException exception) {
			System.out.println("Person is not eligible for voting");
		}
	}

}
