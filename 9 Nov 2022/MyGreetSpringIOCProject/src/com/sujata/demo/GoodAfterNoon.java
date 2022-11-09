package com.sujata.demo;

public class GoodAfterNoon implements Greet {

	public GoodAfterNoon() {
		System.out.println("Good AfterNoon Constructor");
	}
	@Override
	public void wish(String name) {
		System.out.println("Good AfterNoon "+name);

	}

}
