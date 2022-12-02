package com.sujata.model.service;

import com.sujata.entity.Customer;

public interface CustomerService {

	Customer loginCheck(int id,String password);
	
	Customer transferFunds(int myAccountId,int recepientAccountId,double amount);
}
