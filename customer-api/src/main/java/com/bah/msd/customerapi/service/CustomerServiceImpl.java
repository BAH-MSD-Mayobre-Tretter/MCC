package com.bah.msd.customerapi.service;

import org.springframework.stereotype.Service;

import com.bah.msd.customerapi.respository.CustomerRepository;

@Service
public abstract class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
