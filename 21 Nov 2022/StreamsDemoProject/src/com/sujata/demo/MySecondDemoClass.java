package com.sujata.demo;

import java.util.Arrays;
import java.util.List;

public class MySecondDemoClass {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Emily","Sujata","Zoe","Bernice","Natalia","Maria");
		
		long total=names.stream()
		.filter((str)->str.length()>6).count();

		System.out.println("Total No of name with length more than 6 characters "+total);
	}

}
