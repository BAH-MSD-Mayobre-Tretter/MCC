package com.bah.customerapi.service;

import java.util.Collection;

import com.bah.customerapi.domain.Customer;
import com.bah.customerapi.respository.CustomerRepository;

public abstract class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
