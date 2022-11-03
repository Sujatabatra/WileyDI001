package com.sujata.demo;

public class Circle extends InputNumber implements Shape, Output, RoundedShape {

	private double circleCircumference,circleArea;
	
	public Circle(int radius) {
		setValue(radius);
	}
	
	/*
	 * 2*pi*radius
	 */
	@Override
	public void circumference() {
		circleCircumference=2*PI*getValue();

	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+circleArea);
		System.out.println("Circumference of Circle : "+circleCircumference);

	}

	/*
	 * pi*radius*radius
	 */
	@Override
	public void area() {
		circleArea=PI*getValue()*getValue();

	}

}
