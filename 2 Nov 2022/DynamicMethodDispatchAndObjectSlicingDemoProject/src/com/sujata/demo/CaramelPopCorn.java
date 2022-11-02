package com.sujata.demo;

public class CaramelPopCorn extends PopCorn {

	private int caramelQuantity;

	public int getCaramelQuantity() {
		return caramelQuantity;
	}

	public void setCaramelQuantity(int caramelQuantity) {
		this.caramelQuantity = caramelQuantity;
	}

	@Override
	public void pop() {
		System.out.println("Yummy Caramel PopCorn is Popping");
	}

}
