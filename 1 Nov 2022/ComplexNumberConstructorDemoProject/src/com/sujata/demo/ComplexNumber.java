package com.sujata.demo;

/*
 * Constructors are used to 
 * 1. Create Objects and
 * 2. Initialise objects while declaring them.
 * 
 * Rules for creating constructors
 * 1. Constructor name must be same as that of your class name
 * 2. Constructor cannot return any value not even void
 * 3. Constructor can be with parameters or without parameters
 * 4. A class can have many constructors , 
 * but each constructor will be differentiated from one another as per constructor signature (Constructor Overloading)
 * signature means : number and type of arguments and their sequence
 * 5. Constructor can be in any scope i.e private,default,public
 * 
 * Note : If your class is constructor challenged (i.e. class don't have any constructor),
 * compiler will going to create a default constructor for you.
 * 
 * Default Constructor : constructor without parameters
 */
public class ComplexNumber {

	private int real;
	private int imagenary;

	
	public ComplexNumber(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}
//	
	private ComplexNumber() {
		real=0;
		imagenary=0;
	}

	ComplexNumber(int real){
		this.real=real;
		imagenary=5;
	}
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
		ComplexNumber cn=new ComplexNumber();
		this.real=cn1.real+cn2.real;
		this.imagenary=cn1.imagenary+cn2.imagenary;
	}
}
