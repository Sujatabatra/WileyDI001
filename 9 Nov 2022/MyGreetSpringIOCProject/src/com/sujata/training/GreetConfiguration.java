package com.sujata.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.demo.GoodAfterNoon;
import com.sujata.demo.GoodEvening;
import com.sujata.demo.GoodMorning;

@Configuration
public class GreetConfiguration {

	@Bean(name = "mrng")
	public GoodMorning getGoodMoring() {
		return new GoodMorning();
	}
	
	@Bean(name="eve")
	public GoodEvening getGoodEvening() {
		return new GoodEvening();
	}
	
	public GoodAfterNoon getGoodAfterNoon() {
		return new GoodAfterNoon();
	}
}
