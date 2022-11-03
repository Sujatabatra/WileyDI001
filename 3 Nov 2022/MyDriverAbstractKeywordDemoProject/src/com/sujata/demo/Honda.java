package com.sujata.demo;

/*
 * Emily
 */
public class Honda extends Car {

	public Honda(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Audi Engine goes HOOOOM.....");
	}

}
