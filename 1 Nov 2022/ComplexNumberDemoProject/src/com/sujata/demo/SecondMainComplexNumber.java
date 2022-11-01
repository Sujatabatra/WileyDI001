package com.sujata.demo;

public class SecondMainComplexNumber {

	
	
	public static void main(String[] args) {
		
//		Step 1 : null reference variable created
		ComplexNumber complexNumber; 
//		Step2 : class gets instantiated (Object created)
		complexNumber=new ComplexNumber();
		System.out.println(complexNumber);
		complexNumber.input(5, -9);
		complexNumber.display();
		
		
		ComplexNumber cn=new ComplexNumber();
		

	}

}
