package com.sujata.componentproducer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Steph")
public class Dancer implements Performer {

	private String style;
	
	@Value("Salsa") 
	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " + style + " Style");

	}

}
