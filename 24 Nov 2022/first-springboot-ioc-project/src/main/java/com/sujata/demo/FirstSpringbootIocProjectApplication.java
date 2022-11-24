package com.sujata.demo;

import java.applet.AppletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Greet;

//@SpringBootApplication = @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer")
public class FirstSpringbootIocProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(FirstSpringbootIocProjectApplication.class, args);
		
		Greet greet=(Greet)springContainer.getBean("mrng");
		greet.wish();
	}

}
