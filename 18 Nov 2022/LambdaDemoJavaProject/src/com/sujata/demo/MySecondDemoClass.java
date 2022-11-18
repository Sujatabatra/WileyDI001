package com.sujata.demo;

interface DemoInterface{
	void methodOne();
	void methodTwo();
}

@FunctionalInterface
interface Welcome{
	void greet(String name);
}

public class MySecondDemoClass {

	public static void main(String[] args) {
		
		DemoInterface di=new DemoInterface() {
			@Override
			public void methodTwo() {
				System.out.println("MethodOne");
				
			}
			@Override
			public void methodOne() {
				System.out.println("MethodTwo");	
			}
		};
		/*
		 * Is Lambda the replacement of Anonymous Inner class : NO
		 * if interface or class have multiple method , we still need to make use of anonymous inner class
		 * lambda can only be used in case of Functional Interface(with one abstract method)
		 */
		//created Anonymous Inner class
		Welcome welcomeObj1=new Welcome() {
			@Override
			public void greet(String name) {
				System.out.println("Welcome Name");
			}
		};
		
		/*
		 * FunctionalInterface objectName=(arguments)->{body of the function}
		 */
//		Welcome welcomeObj2=(String name)-> {
//				System.out.println("Welcome Name");
//			};
//		

//		Welcome welcomeObj2=(name)-> {
//			System.out.println("Welcome Name");
//		};
	
//		Welcome welcomeObj2=(name)-> System.out.println("Welcome Name");
		
		Welcome welcomeObj2=name-> System.out.println("Welcome Name");
		welcomeObj2.greet("Khari");
	}

}
