package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rect")
public class Rectangle implements Shape {

	private int length, breadth;

	public Rectangle(@Value("5") int length,@Value("4") int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);

	}

}
