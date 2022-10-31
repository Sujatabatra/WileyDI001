package com.sujata.demo;

import com.ash.demo.MirroredNumber;

public class Palindrome {

	private int number;
	private boolean status;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isStatus() {
		checkPalindrome();
		return status;
	}
	public void checkPalindrome() {
		MirroredNumber mOb=new MirroredNumber();
		mOb.setNumber(number);
		if(number==mOb.getMirroredNumber())
			status=true;
		else
			status=false;
	}
	
}
