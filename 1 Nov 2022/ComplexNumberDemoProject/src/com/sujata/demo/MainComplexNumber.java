package com.sujata.demo;

public class MainComplexNumber {

	static ComplexNumber complexNumber;
	
	public static void main(String[] args) {
		
		//Step 1 : null reference variable created
//		ComplexNumber complexNumber; 
		//Step2
//		complexNumber=new ComplexNumber();
		System.out.println(complexNumber);
		complexNumber.input(5, -9);
		complexNumber.display();

	}

}
