package com.sujata.demo;

public class Enterpreneur extends Person {

	private String natureOdBusiness;
	private double turnOver;
	
	public Enterpreneur() {
		
	}

	public Enterpreneur(int id, String name, int age, String natureOdBusiness, double turnOver) {
		super(id, name, age);
		this.natureOdBusiness = natureOdBusiness;
		this.turnOver = turnOver;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Nature of Bussiness : "+natureOdBusiness);
		System.out.println("TurnOver : "+turnOver);
	}
}
