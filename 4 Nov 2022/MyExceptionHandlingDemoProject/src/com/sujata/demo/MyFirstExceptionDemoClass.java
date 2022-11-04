package com.sujata.demo;

import java.util.Scanner;

public class MyFirstExceptionDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int location=0;
		try {
			System.out.println("Enter first Number : ");
			int number1 = scanner.nextInt();
			System.out.println("Enter second Number : ");
			int number2 = scanner.nextInt();

			int result = number1 / number2;

			System.out.println("Result of division : " + result);
			
			int arr[];
			System.out.println("Enter Total Number of elements in an array :");
			int total=scanner.nextInt();
			
			arr=new int[total];
			
			for(int index=0;index<total;index++) {
				System.out.println("Enter "+(index+1)+" value in an array : ");
				arr[index]=scanner.nextInt();
			}
			
			System.out.println("Enter location of an array to extract value : ");
			location=scanner.nextInt();
			
			System.out.println("Value at "+location+" location in an array : "+arr[location]);
		} catch (ArithmeticException exception) {
			System.out.println("Undefined");
		}

		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(location+" location does not exist in an array");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("Array Size must be a positive integer");
		}
		//generic handler : must be the last handler
		catch(Exception exception) {
			System.out.println("Something went wrong, please try again!");
		}
		System.out.println("Good Bye from main Method!");

	}

}
