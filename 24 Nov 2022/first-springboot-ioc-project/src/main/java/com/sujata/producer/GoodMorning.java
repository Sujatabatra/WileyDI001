package com.sujata.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mrng")
public class GoodMorning implements Greet {

	private String name;
	
	@Value("Gemma")
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void wish() {
		System.out.println("Good Morning "+name);

	}

}
