package com.sujata.demo;

class StaticBlockDemo{
	/*
	 * static block is the very first block which gets called only once at the time of class loading
	 */
	static {
		System.out.println("Hi I am Static Block");
	}
	
	/*
	 * instanc3 block will get called everytime before every constructor call
	 */
	{
		System.out.println("Hi I am Instance Block");
	}
	
	public StaticBlockDemo() {
		System.out.println("Hi I am constructor of StaticBlockDemo class");
	}
}

class Derived extends StaticBlockDemo{
	
	static {
		System.out.println("Hi I am Static Block - Derived");
	}
	
	{
		System.out.println("Hi I am Instance Block -  Derived");
	}
	
	public Derived() {
		//implciit call to base class default constructor
		System.out.println("Hi I am constructor of Derived class");
	}
}
public class StaticBlockDemoClass {

	public static void main(String args[]) {
		Derived dObj=new Derived();  // Khari :6,21,10,14,25,29
	}     
}
