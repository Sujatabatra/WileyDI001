package com.sujata.demo;

/*
 * Nico
 */
public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
	}
	
	@Override
	public void engine() {
		System.out.println("Audi Engine goes AOOOOM.....");
	}

}
