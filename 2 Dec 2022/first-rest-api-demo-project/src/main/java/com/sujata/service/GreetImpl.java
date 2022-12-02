package com.sujata.service;

import org.springframework.stereotype.Service;

@Service
public class GreetImpl implements Greet {

	@Override
	public String wish() {
		return "Hi I am first Rest API!";
	}

}
