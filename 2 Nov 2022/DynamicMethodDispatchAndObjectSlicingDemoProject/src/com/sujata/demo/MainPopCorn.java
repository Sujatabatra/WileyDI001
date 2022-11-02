package com.sujata.demo;

public class MainPopCorn {

	public static void main(String[] args) {
		//reference variable
		PopCorn popcorn;
		
		popcorn=new CheesePopCorn();
		popcorn.setPrice(10);
		popcorn.pop();
		System.out.println("Kindly Pay : "+popcorn.getPrice());
		
		popcorn=new CaramelPopCorn();
		popcorn.setPrice(25);
		popcorn.setCaramelQuantity(3);
		popcorn.pop();

	}

}
