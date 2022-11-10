package com.sujata.componentconsumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.componentproducer.Performer;

public class PerformerClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformerConfiguration.class);

		Performer performer1=(Performer)springContainer.getBean("Laura");
		performer1.perform();
	}

}
