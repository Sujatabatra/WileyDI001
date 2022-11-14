package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Rectangle;
import com.sujata.producer.Square;

@Configuration
@ComponentScan(basePackages = "com.sujata.producer")
public class ShapeConfiguration {

}
