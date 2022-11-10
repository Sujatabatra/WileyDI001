package com.sujata.componentproducer;


public class Juggler implements Performer {

	private int balls;
	
	
	public void setBalls(int balls) {
		this.balls = balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
