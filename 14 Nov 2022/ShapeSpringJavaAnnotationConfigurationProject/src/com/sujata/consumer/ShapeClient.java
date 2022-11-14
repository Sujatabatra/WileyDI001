package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Shape;

public class ShapeClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(ShapeConfiguration.class);
		
		Shape shape1=(Shape)springContainer.getBean("sq");
		shape1.area();

	}

}
