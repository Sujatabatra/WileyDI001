package com.sujata.demo;

public class MainPopCornStore {

	public static void main(String[] args) {
		
		PopCornStore popCornStore=new PopCornStore();

		popCornStore.buy(new SaltedPopCorn());
		
		popCornStore.buy(new PopCorn() {	
			@Override
			public void pop() {
				System.out.println("Salted Caramel PopCorn Popping");
				
			}
		});
		
		PopCorn p1=new PopCorn() {
			
			@Override
			public void pop() {
				System.out.println("Butter PopCorn Popping");
				
			}
		};
		
		popCornStore.buy(p1);
		
	}

}
