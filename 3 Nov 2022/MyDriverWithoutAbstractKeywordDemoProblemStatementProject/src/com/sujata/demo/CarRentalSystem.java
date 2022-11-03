package com.sujata.demo;

/*
 * Faiza
 */
public class CarRentalSystem {

	public static void main(String[] args) {
		Audi audi=new Audi("A8", "Red");
		BMW bmw=new BMW("Q5", "Silver");
		Honda honda=new Honda("City", "Blue");
		
		Driver john=new Driver("John");
		Driver alex=new Driver("Alex");
		
		john.setCar(audi);
		john.drive();
		
		alex.setCar(bmw);
		alex.drive();
	}

}
