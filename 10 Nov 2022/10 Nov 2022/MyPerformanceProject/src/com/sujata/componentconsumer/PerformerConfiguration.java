package com.sujata.componentconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.componentproducer.Dancer;
import com.sujata.componentproducer.Juggler;
import com.sujata.componentproducer.Singer;

@Configuration
public class PerformerConfiguration {

	@Bean(name="Gemma")
	public Singer getSinger() {
		return new Singer();
	}
	
	@Bean(name="Laura")
	public Juggler getJuggler() {
		return new Juggler();
	}
	
	@Bean(name="Steph")
	public Dancer getDancer() {
		return new Dancer();
	}
}
