package com.sujata.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyFifthDemoClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,-32,90,-7,-4,50);
		
//		list.stream()
//		.map(new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				if(t<0)
//					t=t*-1;
//				return t;
//			}
//		}).forEach(t->System.out.println(t));

		list.stream()
		.map(t-> {
				if(t<0)
					t=t*-1;
				return t;
			}
		).forEach(t->System.out.println(t));
	}

}
