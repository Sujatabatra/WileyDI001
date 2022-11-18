package com.sujata.demo;

@FunctionalInterface
interface Operator{
	int perform(int number1,int number2);
}

public class MyFourthDemoClass {

	public static void main(String[] args) {
//		Operator sum=new Operator() {
//			
//			@Override
//			public int perform(int number1, int number2) {
//				
//				return number1+number2;
//			}
//		};

		/*
		 * if lambda is returning some value 
		 * and return statement is the only statement in lambda body
		 * then we can eliminate return keyword too
		 */
//		Operator sum=(number1,number2)-> {
//				return number1+number2;
//			};
		
			Operator sum=(number1,number2)-> number1+number2;
			
		System.out.println("Sum = "+sum.perform(10, 30));
	}

}
