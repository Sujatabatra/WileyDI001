package com.batra.demo;

import com.sujata.training.MyFirstClass;
//import com.sujata.demo.MyFirstClass;

public class MyMain {

	public static void main(String[] args) {
//		com.sujata.training.MyFirstClass ob1=new com.sujata.training.MyFirstClass();

		MyFirstClass ob1=new MyFirstClass();
		ob1.second();
		
		com.sujata.demo.MyFirstClass ob2=new com.sujata.demo.MyFirstClass();

		ob2.second();
	}

}
