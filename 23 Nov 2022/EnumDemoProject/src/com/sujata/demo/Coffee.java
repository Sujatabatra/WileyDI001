package com.sujata.demo;

public enum Coffee {

	MOCHA(5,20,true,"Powder"){

		@Override
		public void buyCoffee() {
			System.out.println("We are serving you "+getSize()+" ounces of Mocha in money value "+getPrice()+" sugar is "+isSugar()+" with "+getMilkType()+" milk");
			
		}
		
	},CAPPUCCINO(8,30,false,"Liquid"){

		@Override
		public void buyCoffee() {
			System.out.println("We are serving you "+getSize()+" ounces of Cappuccino in money value "+getPrice()+" sugar is "+isSugar()+" with "+getMilkType()+" milk");
			
		}
		
	},LATE(6,25,false,"Powder"){

		@Override
		public void buyCoffee() {
			System.out.println("We are serving you "+getSize()+" ounces of Late in money value "+getPrice()+" sugar is "+isSugar()+" with "+getMilkType()+" milk");
			
		}
		
	};
	
	private Coffee(int size, double price, boolean sugar, String milkType) {
		this.size = size;
		this.price = price;
		this.sugar = sugar;
		this.milkType = milkType;
	}
	private int size;
	private double price;
	private boolean sugar;
	private String milkType;
	public int getSize() {
		return size;
	}
	public double getPrice() {
		return price;
	}
	public boolean isSugar() {
		return sugar;
	}
	public String getMilkType() {
		return milkType;
	}
	
	public abstract void buyCoffee();
	
	
}
