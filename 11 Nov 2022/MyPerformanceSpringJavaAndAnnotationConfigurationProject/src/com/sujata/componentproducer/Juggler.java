package com.sujata.componentproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Laura")
public class Juggler implements Performer {

	private int balls;
	
	@Value("5") 
	public void setBalls(int balls) {
		this.balls = balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
