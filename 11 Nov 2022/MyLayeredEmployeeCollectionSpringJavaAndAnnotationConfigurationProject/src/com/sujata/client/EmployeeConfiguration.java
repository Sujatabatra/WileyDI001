package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class EmployeeConfiguration {

	
}
