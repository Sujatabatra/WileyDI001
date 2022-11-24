package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eve")
public class GoodEvening implements Greet {

	private String name;
	
	
	public GoodEvening(@Value("Khari") String name) {
		super();
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Evening "+name);

	}

}
