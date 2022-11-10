package com.sujata.componentproducer;

public class Singer implements Performer {

	private String song;

	public Singer(String song) {
		super();
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing " + song);

	}

}
