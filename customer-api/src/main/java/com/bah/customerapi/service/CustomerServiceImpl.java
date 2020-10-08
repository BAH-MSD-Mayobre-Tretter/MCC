package com.bah.customerapi.service;

import org.springframework.stereotype.Service;

import com.bah.customerapi.respository.CustomerRepository;

@Service
public abstract class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
