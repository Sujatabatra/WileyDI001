package com.sujata.producer;

public class Square implements Shape {

	private int side;

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		int area = side * side;
		System.out.println("Area of Square : " + area);

	}

}
