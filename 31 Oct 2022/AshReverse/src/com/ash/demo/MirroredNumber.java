package com.ash.demo;

public class MirroredNumber {

	private int number,mirroredNumber;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMirroredNumber() {
		calculateReverse();
		return mirroredNumber;
	}


	private void calculateReverse() {
		while(number>0) {
			int remainder=number%10;
			mirroredNumber=mirroredNumber*10+remainder;
			number=number/10;
		}
	}
	
}
