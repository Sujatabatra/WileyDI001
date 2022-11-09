package com.sujata.demo;

public class GoodMorning implements Greet {

	
	public GoodMorning() {
		System.out.println("GoodMorning Constructor");
	}
	@Override
	public void wish(String name) {
		System.out.println("Good Morning "+name);

	}

}
