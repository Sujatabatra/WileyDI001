package com.sujata.generics;

import com.sujata.misccocepts.Person;

class IntegerInput {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class StringInput {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

class DoubleInput {
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}

class GenericInput<T>{
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}
public class MyFirstClass {

	public static void main(String[] args) {
		GenericInput<Integer> ob1=new GenericInput<Integer>();
		
		ob1.setValue(67);
		System.out.println(ob1.getValue());
		
		GenericInput<String> ob2=new GenericInput<String>();
		ob2.setValue("Sujata");
		System.out.println(ob2.getValue());
		
		GenericInput<Person> ob3=new GenericInput<>();
		ob3.setValue(new Person(111, "XYZ"));
		System.out.println(ob3.getValue());

	}

}
