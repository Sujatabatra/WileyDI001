package com.sujata.demo;

public class MainShape {

	public static void main(String[] args) {
		Circle circle=new Circle(6);
		circle.area();
		circle.circumference();
		circle.display();

		Rectangle rectangle=new Rectangle(4, 7);
		rectangle.area();
		rectangle.perimeter();
		rectangle.display();
	}

}
