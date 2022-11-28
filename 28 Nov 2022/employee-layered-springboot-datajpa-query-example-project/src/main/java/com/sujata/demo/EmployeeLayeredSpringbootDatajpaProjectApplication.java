package com.sujata.demo;

import java.util.Scanner;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class EmployeeLayeredSpringbootDatajpaProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(EmployeeLayeredSpringbootDatajpaProjectApplication.class, args);
		Scanner scanner=new Scanner(System.in);

		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("presentation");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	
	}

}
