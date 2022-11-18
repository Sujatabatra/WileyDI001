package com.sujata.demo;

/*
 * A lambda expression can have zero, one or more parameters.
 * The type of the parameters can be explicitly declared or it can be inferred from the context.
 * Multiple parameters are enclosed in mandatory parentheses and separated by commas. 
 * Empty parentheses are used to represent an empty set of parameters.
 * When there is a single parameter, if its type is inferred, it is not mandatory to use parentheses. e.g. a -> return a*a.
 * The body of the lambda expressions can contain zero, one or more statements.
 * If body of lambda expression has single statement curly brackets are not mandatory and 
 * the return type of the anonymous function is the same as that of the body expression. 
 * When there is more than one statement in body than these must be enclosed in curly brackets.

 */
class Demo {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void show() {
		System.out.println("Value : " + value);
	}
}

@FunctionalInterface
interface Greet {
	void wish();
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		int x = 10;
		double d = 5.6;
		boolean b = true;

		Demo d1 = new Demo() {
			@Override
			public void show() {
				System.out.println("Show method for showing value " + value);
			}
		};

//		dataType varName=void hello(){
//			System.out.println("Wishing Hello");
//		}

		Greet greet = new Greet() {
			@Override
			public void wish() {
				System.out.println("Good Evening Everyone from Anonymous Inner Class");

			}
		};
		greet.wish();
//		Greet greet1=()-> {
//				System.out.println("Good Evening Everyone from Lambda");
//			};

		Greet greet1 = () -> System.out.println("Good Evening Everyone from Lambda");
		greet1.wish();
	}

}
