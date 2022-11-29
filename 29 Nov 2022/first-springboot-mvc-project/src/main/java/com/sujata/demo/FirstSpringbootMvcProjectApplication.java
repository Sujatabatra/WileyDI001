package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class FirstSpringbootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootMvcProjectApplication.class, args);
	}

}
