package com.sujata.demo;

class StaticVariableDemo{
	int i;
	static int j;
	
}
public class StaticVariableDemoClass {

	public static void main(String[] args) {
		System.out.println(StaticVariableDemo.j);
		StaticVariableDemo.j=90;
		System.out.println(StaticVariableDemo.j);
		
		StaticVariableDemo obj1=new StaticVariableDemo();
		System.out.println(obj1.j);
		
		StaticVariableDemo obj2=new StaticVariableDemo();
		obj2.j=obj2.j+5;
		System.out.println(obj1.j);
		

	}

}
