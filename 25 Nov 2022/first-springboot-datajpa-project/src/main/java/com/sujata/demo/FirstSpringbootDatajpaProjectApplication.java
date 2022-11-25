package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.entity.Customer;
import com.sujata.persistence.CustomerDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootDatajpaProjectApplication {

	public static void main(String[] args) {
	 ApplicationContext springContainer=SpringApplication.run(FirstSpringbootDatajpaProjectApplication.class, args);
	 
	 CustomerDao dao=(CustomerDao)springContainer.getBean("customerDao");
	 
	 dao.save(new Customer(1,"AAA","Some Address A","aaa@xyz.com",45000));
	 dao.save(new Customer(2,"BBB","Some Address B","bbb@xyz.com",5000));
	 dao.save(new Customer(3,"CCC","Some Address C","ccc@xyz.com",2500));
	}

}
