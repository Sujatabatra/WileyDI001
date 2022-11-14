package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sq")
public class Square implements Shape {

	private int side;

	@Value("7")
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		int area = side * side;
		System.out.println("Area of Square : " + area);

	}

}
