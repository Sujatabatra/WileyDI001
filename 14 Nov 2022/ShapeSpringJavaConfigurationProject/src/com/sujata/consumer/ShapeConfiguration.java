package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Rectangle;
import com.sujata.producer.Square;

@Configuration
public class ShapeConfiguration {

	@Bean(name = "rect")
	public Rectangle getRectangle() {
		return new Rectangle(5,7);
	}
	
	@Bean(name="sq")
	public Square getSquare() {
		Square square=new Square();
		square.setSide(6);
		return square;
	}
}
