package com.sujata.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		double d1=374.56;
		double d2=374.26;
		System.out.println(" d1 - d2 : "+(d1-d2));
		
		
		BigDecimal bd1=new BigDecimal("374.56");
		BigDecimal bd2=new BigDecimal("374.26");
		
		System.out.println("bd1 - bd2 : "+bd1.subtract(bd2));

		BigDecimal bd3=new BigDecimal("12.1256");
		System.out.println("bd3 :"+bd3.setScale(2,RoundingMode.CEILING));
		
		System.out.println("bd3 :"+bd3.setScale(2,RoundingMode.FLOOR));
	}

}
