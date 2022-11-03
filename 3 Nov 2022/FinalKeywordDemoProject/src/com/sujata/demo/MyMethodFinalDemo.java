package com.sujata.demo;

/*
 * If the method is final we won't be able to over ride it
 */
class MyBase{
	
	public void methodOne() {
		System.out.println("methodOne");
	}
	final public void methodTwo() {
		System.out.println("methodTwo");
	}
	public void methodThree() {
		System.out.println("methodThree");
	}
}

class MyDerived extends MyBase{
	
	@Override
	public void methodOne() {
		System.out.println("MyDerived - methodOne");
	}
//	@Override
//	public void methodTwo() {
//		System.out.println("MyDerived - methodTwo");
//	}
	@Override
	public void methodThree() {
		System.out.println("MyDerived - methodThree");
	}
}

public class MyMethodFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
