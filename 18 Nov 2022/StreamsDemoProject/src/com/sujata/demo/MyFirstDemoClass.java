package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,21,32,47,59);
		
		System.out.println("Total No Of Element :"+list.stream().count());
		
//		long totalNoOfEvenElement=list.stream().filter(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				
//				return t%2==0;
//			}
//		}).count();
		
		long totalNoOfEvenElement=list.stream().filter((t)-> t%2==0).count();
		
		System.out.println("Total No Of even Element : "+totalNoOfEvenElement);

	}

}
