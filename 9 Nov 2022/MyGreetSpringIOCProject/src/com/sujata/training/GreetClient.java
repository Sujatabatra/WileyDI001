package com.sujata.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.demo.GoodEvening;
import com.sujata.demo.GoodMorning;
import com.sujata.demo.Greet;

public class GreetClient {

	public static void main(String[] args) {
		
		/*
		 * You need not to create component, rather
		 * Spring container will create component for you,
		 * Ques :How Spring Container will know about component?
		 * Ans : with the help of configuration file
		 */
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(GreetConfiguration.class);
		//dependency
//		Greet greet=new GoodMorning();
		Greet greet=(Greet)springContainer.getBean("mrng");
		greet.wish("Gemma");
		
		//dependency
//		greet=new GoodEvening();
		
//		greet.wish("Aishwarya");
		
	}

}
