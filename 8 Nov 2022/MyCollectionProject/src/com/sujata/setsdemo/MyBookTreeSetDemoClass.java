package com.sujata.setsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyBookTreeSetDemoClass {

	public static void main(String args[]) {
		/*
		 * TreeSet : unique sorted collection of values, which is auto-growable and auto-shrinkable 
		 */
//		Set<MyBook> myCollection=new TreeSet<MyBook>(new AuthorNameSort());
		Set<MyBook> myCollection=new TreeSet<MyBook>(new NoOfPagesSort());
		System.out.println("Size : "+myCollection.size());
		myCollection.add(new MyBook(101, "Book 1", "Author A", 450, 1200));
		myCollection.add(new MyBook(102, "Book 2", "Author B", 950, 1000));
		myCollection.add(new MyBook(103, "Book 3", "Author Z", 870, 2100));
		myCollection.add(new MyBook(104, "Book 4", "Author C", 350, 800));
		myCollection.add(new MyBook(105, "Book 5", "Author M", 1450, 3200));
		
		System.out.println("Size : "+myCollection.size());
		System.out.println(myCollection);
		
		myCollection.add(new MyBook(101, "Book 1", "Author A", 450, 1200));
		myCollection.add(new MyBook(102, "Book 6", "Author X", 4150, 1900));
		
		System.out.println("Size : "+myCollection.size());
		System.out.println(myCollection);
		
		
		System.out.println("Traversal using for each loop");
		for(MyBook element:myCollection) {
			System.out.println(element);
		}

		System.out.println("Traversal using Iterator");
		Iterator<MyBook> iterator=myCollection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}
}
