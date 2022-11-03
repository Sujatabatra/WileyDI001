package com.sujata.demo;

public class Rectangle implements NonRoundedShape {

	private int length,breadth,rectPerimeter,rectArea;

	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		rectArea=length*breadth;

	}

	@Override
	public void display() {
		System.out.println("Area of Rectangle : "+rectArea);
		System.out.println("Perimeter of Rectangle : "+rectArea);

	}

	@Override
	public void perimeter() {
		rectPerimeter=2*(length+breadth);

	}

}
