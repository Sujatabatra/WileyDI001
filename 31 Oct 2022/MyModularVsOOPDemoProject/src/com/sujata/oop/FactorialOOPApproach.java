package com.sujata.oop;

/*
 * Data : input and output variables
 * 1. Make data readable : create getter method for that variable
 * 2. Make data modifiable/ writable : create setter method for that variable
 * 3. both 1 and 2 : create getter as well as setter method for that variable
 */
public class FactorialOOPApproach {

	private int number,factorial;

	
	public void setNumber(int number) {
		this.number = number;
	}


	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	

	private void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial=factorial*number;
			number--;
		}
	}
	
}
