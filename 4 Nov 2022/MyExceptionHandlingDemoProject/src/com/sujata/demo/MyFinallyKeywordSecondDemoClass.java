package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFinallyKeywordSecondDemoClass {

	
	static public void divide(int number1,int number2) {
//		try {
			int result=number1/number2;
			System.out.println("Result of Division : "+result);
			System.out.println("Good Bye from try!");
			return;
//		}
//		catch(NegativeArraySizeException exception) {
//			System.out.println("Something went wrong");
//		}
//		finally {
//			System.out.println("Hi I am finally block");
//		}
//		System.out.println("Good Bye from divide");
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();
		
		divide(number1, number2);
		}
		catch (ArithmeticException e) {
			System.out.println("Undefined : Main");
		}
		catch (InputMismatchException e) {
			System.out.println("Kindly enter integer");
		}
		System.out.println("Good Bye from main!");
				

	}

}
