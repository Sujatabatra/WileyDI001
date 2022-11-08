package com.sujata.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * LinkedList(Doubly Linked) is duplicate ordered collection of indexed objects, 
		 * which is auto growable and auto Shrinkable
		 */
		List<Integer> myCollection=new LinkedList<Integer>();
		
		
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		myCollection.add(10);
		myCollection.add(89);
		myCollection.add(46);
		myCollection.add(99);
		myCollection.add(23);
		myCollection.add(46);
		System.out.println("Size of myCollection : "+myCollection.size());
		System.out.println(myCollection);
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<myCollection.size();index++) {
			System.out.println(myCollection.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(Integer element:myCollection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using iterator");
		Iterator<Integer> iterator=myCollection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Reverse Traversal using ListIterator");
		ListIterator<Integer> listIterator=myCollection.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
			
		
		
	}

}
