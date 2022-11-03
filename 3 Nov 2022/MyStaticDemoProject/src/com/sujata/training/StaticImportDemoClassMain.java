package com.sujata.training;

/*
 * import static will import all the static members of the class,
 * For calling the visible static members we need not to use tha class name
 */
import static com.sujata.demo.StaticImportDemoClass.*;

import com.sujata.demo.StaticImportDemoClass;

import static java.lang.Math.*;

public class StaticImportDemoClassMain {

	public static void main(String[] args) {
//		StaticImportDemoClass.methodTwo();
//		
//		StaticImportDemoClass.methodFour();

		
		methodTwo();
		
		methodFour();
		
		StaticImportDemoClass obj=new StaticImportDemoClass();

		System.out.println(PI);
		
	}

}
