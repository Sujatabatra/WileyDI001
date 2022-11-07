package com.sujata.setsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSetDemoClass {

	public static void main(String args[]) {
		/*
		 * TreeSet : unique sorted collection of values, which is auto-growable and auto-shrinkable 
		 */
		Set<Integer> myCollection=new TreeSet<Integer>();
		
		System.out.println("Size : "+myCollection.size());
		myCollection.add(20);
		myCollection.add(50);
		myCollection.add(90);
		myCollection.add(40);
		myCollection.add(68);
		
		System.out.println("Size : "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.add(40);
		myCollection.add(88);
		
		System.out.println("Size : "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.remove(50);
		System.out.println("Size : "+myCollection.size());
		System.out.println(myCollection);
		System.out.println("Traversal using for each loop");
		for(Integer element:myCollection) {
			System.out.println(element);
		}

		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=myCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}
}
