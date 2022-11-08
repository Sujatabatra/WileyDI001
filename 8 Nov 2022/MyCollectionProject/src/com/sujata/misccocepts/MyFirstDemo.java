package com.sujata.misccocepts;

public class MyFirstDemo {

	public static void main(String[] args) {
		int i=10;
		System.out.println("i : "+i);
		
		Person person=new Person(101, "AAAA");
		/*
		 * whenever we try to print object with System.out.println(),
		 * an implicit call goes to toString() method of Object class,
		 * default behavior of two string is returning absoluteclassname@hashcode
		 */
		System.out.println("person : "+person );
		
		
		

	}

}
