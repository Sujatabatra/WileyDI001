package com.sujata.modular;

/*
 * Break long program in small modules
 * maintain each and every small module seperatly
 * and then integrate them
 * =====================
 * ignore static as we are trying to mimic modular behaviour from JAVA which is OOP
 */
public class FactorialModularApproach {
	
	static int number,factorial;
	
	static void input(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial=factorial*number;
			number--;
		}
	}
	
	static void display() {
		System.out.println("Factorial : "+factorial);
	}
	

	public static void main(String args[]) {
		input(4);
		
		calculateFactorial();
		factorial=factorial*0; //Logical Error
		display();
	}
}
