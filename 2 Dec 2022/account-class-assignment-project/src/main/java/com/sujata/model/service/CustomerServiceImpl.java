package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.Customer;
import com.sujata.model.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer loginCheck(int id, String password) {
		try {
		Customer customer=customerDao.findUserByAccountIdAndCustomerPassword(id, password);
		return customer;
		}catch(Exception exception) {
			return null;
		}
		
		
	}

	@Override
	public Customer transferFunds(int myAccountId, int recepientAccountId, double amount) {
		Customer customer=customerDao.findById(myAccountId).get();
		if(customer.getCustomerBalance()<amount)
			return null;
		else {
			Customer recepient=customerDao.findById(recepientAccountId).orElse(null);
			if(recepient!=null) {
				recepient.setCustomerBalance(recepient.getCustomerBalance()+amount);
				customer.setCustomerBalance(customer.getCustomerBalance()-amount);
				customerDao.save(recepient);
				customerDao.save(customer);
				return customer;
			}
			else
				return null;
			
		}
			
		
	}

}
