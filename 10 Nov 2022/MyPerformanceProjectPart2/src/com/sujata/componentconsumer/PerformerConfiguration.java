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
		//Constructor Injection
		return new Singer("Baby Go Back");
	}
	
	@Bean(name="Laura")
	public Juggler getJuggler() {
		Juggler juggler=new Juggler();
		//Setter Injection
		juggler.setBalls(5);
		return juggler;
	}
	
	@Bean(name="Steph")
	public Dancer getDancer() {
		Dancer dancer=new Dancer();
		//Setter Injection
		dancer.setStyle("Salsa");
		return dancer;
	}
	
	
	@Bean(name="Vic")
	public Dancer getDancer1() {
		Dancer dancer=new Dancer();
		//Setter Injection
		dancer.setStyle("Moon Walk");
		return dancer;
	}
}
