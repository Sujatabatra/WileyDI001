package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
/*
 * Predefined Functional Interfaces
 * Predicate T->boolean, one argument with boolean return type
 * Function T->K , one argument with return type
 * Consumer T->void , one argument no return type
 * Supplier ()->T, no argument but return type
 * 
 */
public class MyFourthDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,23,45,69,70);

		list.stream()
		.map(element->element+5)
		.forEach(element->System.out.println(element));
	}

}
