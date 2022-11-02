package com.laura.demo;

import com.sujata.demo.PopCorn;

public class FoodCourt {

	private PopCorn popCorn;

	public void setPopCorn(PopCorn popCorn) {
		this.popCorn = popCorn;
	}
	
	public void buyPopCorn() {
		popCorn.pop();
	}
}
