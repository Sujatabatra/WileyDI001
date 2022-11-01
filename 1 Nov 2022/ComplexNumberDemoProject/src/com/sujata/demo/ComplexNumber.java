package com.sujata.demo;

public class ComplexNumber {

	private int real;
	private int imagenary;

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}

	/*
	 * this stores the reference of current object/instance
	 */                       
	public void input(int real, int imagenary) {
//		referneceOfCurrent.instancevariable=localvariable
		this.real = real;
		this.imagenary = imagenary;
	}

	public void display() {
		System.out.print(real);
		if (imagenary > 0)
			System.out.println("+" + imagenary + "i");
		else if (imagenary < 0)
			System.out.println(imagenary + "i");
	}
	
	public void sumComplexNumbers(ComplexNumber cn1,ComplexNumber cn2) {
		this.real=cn1.real+cn2.real;
		this.imagenary=cn1.imagenary+cn2.imagenary;
	}
}
