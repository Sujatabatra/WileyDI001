package com.sujata.misccocepts;

public class MySecondDemo {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		if(i==j)
			System.out.println("i and j are same");
		else
			System.out.println("i and j are not same");
		

		Person p1=new Person(101, "QWERTY");
		Person p2=new Person(101,"QWERTY");
		/*
		 * == checks is two reference variables pointing to same object on heap
		 */
		if(p1==p2)
			System.out.println("p1 and p2 are same");
		else
			System.out.println("p1 and p2 are not same");

		
		Person p3=p1;
		if(p3==p1)
			System.out.println("p3 and p1 are same");
		else
			System.out.println("p3 and p1 are not same");
		
		/*
		 * equals() method is of Object class,
		 * and its behavior is to check whether two reference variable pointing to same object on heap,
		 * and if we want to change the behavior of equals() override it.
		 */
		
		if(p1.equals(p2))
			System.out.println("p1 and p2 are same");
		else
			System.out.println("p1 and p2 are not same");
		
	}

}
