package com.sujata.componentconsumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.componentproducer.Performer;

public class PerformerClient {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);

		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performace.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Steph");
		performer1.perform();
		
		Performer performer2=(Performer)springContainer.getBean("Gemma");
		performer2.perform();
		
		Performer performer3=(Performer)springContainer.getBean("Laura");
		performer3.perform();
		
		Performer performer4=(Performer)springContainer.getBean("Vic");
		performer4.perform();
		
		Performer performer5=(Performer)springContainer.getBean("Maria");
		performer5.perform();
	}

}
