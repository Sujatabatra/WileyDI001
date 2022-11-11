package com.sujata.componentproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Gemma")
public class Singer implements Performer {

	private String song;

	public Singer(@Value("Baby Go Back") String song) {
		super();
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing " + song);

	}

}
