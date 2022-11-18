package com.sujata.demo;

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
