package com.sujata.demo;

public class CarRentalSystem {

	public static void main(String[] args) {
		Audi audi=new Audi("A8", "Red");
		BMW bmw=new BMW("Q5", "Silver");
		Honda honda=new Honda("City", "Blue");
		
		Driver john=new Driver("John");
		Driver alex=new Driver("Alex");
		
		john.setCar(bmw);
		john.drive();

	}

}
