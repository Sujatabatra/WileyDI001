package com.sujata.componentconsumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.componentproducer.Dancer;
import com.sujata.componentproducer.Juggler;
import com.sujata.componentproducer.Singer;

@Configuration
/*
 * when springContainer look for @ComponentScan it scans
 *  all the classes annotated with @Component (to run their life cycle) 
 *  in the package and sub-packages specified in basePackages attribute
 * 
 */
@ComponentScan(basePackages = "com.sujata.componentproducer") 
public class PerformerConfiguration {

	
}
