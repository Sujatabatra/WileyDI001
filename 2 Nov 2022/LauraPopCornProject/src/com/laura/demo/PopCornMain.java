package com.laura.demo;

import com.sujata.demo.PopCorn;
/*
 * Dynamic Method Dispatch
 * Base class reference variable is type compatible with derived class,
 * means in base class reference variable , we can store the object of derived class
 */
public class PopCornMain {

	public static void main(String[] args) {
		//reference variable
//		PopCorn popCorn;
//		
//		popCorn=new PopCorn();
//		popCorn.pop();
		
//		popCorn=new CaramelPopCorn();
//		popCorn.pop();
//		
//		
//		popCorn=new ButterPopCorn();
//		popCorn.pop();
//		PopCorn popCorn=new PopCorn();
////		popCorn.pop();
//
		FoodCourt foodCourt=new FoodCourt();
		foodCourt.setPopCorn(new ButterPopCorn());
		foodCourt.buyPopCorn();
		
		foodCourt.setPopCorn(new CaramelPopCorn());
		foodCourt.buyPopCorn();
	}

}
