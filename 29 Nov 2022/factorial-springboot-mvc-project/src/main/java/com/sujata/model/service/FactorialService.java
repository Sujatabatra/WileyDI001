package com.sujata.model.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

	public int getFactorial(int number) {
		int factorial=1;
		while(number>1) {
			factorial*=number--;
		}
		return factorial;
	}
	
	
}
