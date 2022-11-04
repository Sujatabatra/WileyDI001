package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyThrowsKeywordFirstDemoClass {

	static public void openFile(String fileName)throws FileNotFoundException {
//		try {
			FileInputStream fileInputStream=new FileInputStream(fileName);
//			System.out.println("File "+fileName+" exist");
//		} catch (FileNotFoundException e) {
//			System.out.println("File with name "+fileName+" does not exist");
//		}
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter File Name : ");
		String fileName=scanner.next();
		try {
		openFile(fileName);
		System.out.println("You can start reading from file "+fileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("Sorry no such file exist");
		}
		
	}

}
