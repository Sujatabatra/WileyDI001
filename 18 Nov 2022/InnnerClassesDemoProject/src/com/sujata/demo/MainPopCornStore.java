package com.sujata.demo;

public class MainPopCornStore {

	public static void main(String[] args) {
		
		PopCornStore popCornStore=new PopCornStore();

		popCornStore.buy(new SaltedPopCorn());
		
//		popCornStore.buy(new PopCorn() {	
//			@Override
//			public void pop() {
//				System.out.println("Salted Caramel PopCorn Popping");
//				
//			}
//		});
		
		popCornStore.buy(()->System.out.println("Salted Caramel PopCorn Popping"));
				
			
		PopCorn p1=new PopCorn() {
			
			@Override
			public void pop() {
				System.out.println("Butter PopCorn Popping");
				System.out.println("Yum Yum Yum");
				
			}
			
			public void quantity() {
				System.out.println("2 ounces of butter popcorn");
			}
		};
		
		p1.pop();
//		p1.quantity();
		popCornStore.buy(p1);
		
	}

}
