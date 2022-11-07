package com.sujata.misccocepts;

/*
 * All instance variables get default initial value
 * byte,short,int,long : 0
 * float,double : 0.0
 * boolean : false
 * char : /u000
 * String or any other call object : null
 */
class MyClass{
	private int i;
	
	public void input(int i) {
		this.i=i;
	}
	
	public void display() {
		/*
		 * j is the method local variable as declared inside display method.
		 * method local variable
		 * 1. gets the memory area on stack
		 * 2. don't get any default initial value
		 * if anytime we try to use method local variable without initializing it,
		 * compiler will report an error : the local variable may not have been initialized
		 */
		int j=0;
		
		System.out.println("i : "+i);
		System.out.println("j : "+j);
		/*
		 * as Integer is a Wrapper class,
		 * so k is an object and gets the memory area on heap,
		 * irrespective of k is a method local  variable 
		 */
		Integer k=0;
		System.out.println("k : "+k);
	}
}
public class MyThirdClass {

	public static void main(String[] args) {
		MyClass myClass=new MyClass();
		myClass.display();

//		Integer i=new Integer(10);
		/*
		 * value of converts primitve or String to Wrapper Object
		 */
		Integer i=Integer.valueOf("10");
	}

}
