package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Shape;

public class ShapeClient {

	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("shapeconfig.xml");
		
		Shape shape1=(Shape)springContainer.getBean("sq");
		shape1.area();

	}

}
