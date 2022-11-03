package com.sujata.demo;
/*
 * abstract : is like a contract with a child class
 * to implement abstract method
 * Rules for abstract
 * 1. abstract method don't have any body
 * 2. If a class contains even a single abstract method then it is mandatory for us to mark that class abstract
 * We cannot instantiate( create object of abstract class)
 */
abstract public class Car {

	private String model, color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public void engine();
}
