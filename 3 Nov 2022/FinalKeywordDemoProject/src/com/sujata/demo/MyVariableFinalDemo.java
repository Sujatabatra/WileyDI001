package com.sujata.demo;
/*
 * If the variable is final,
 * we either need to initialise it on the same line as that or declaration
 * or we need initialise it with constructor, otherwise compilation error
 * 
 * final variable cannot be modified once initialised
 */
class Base {
	private int i;
//	final private int j=5;

	final private int j;
	public Base(int j) {
		super();
		this.j = j;
	}

	public void show() {
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}

	public void manupulateIAndJ() {
		i = i + 5;
//		j = j + 4;
	}
}

public class MyVariableFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
