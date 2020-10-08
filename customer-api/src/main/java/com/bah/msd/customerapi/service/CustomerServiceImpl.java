package com.bah.msd.customerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bah.msd.customerapi.domain.Customer;
import com.bah.msd.customerapi.respository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	@Override
	public Customer findById(long id) {
		return (customerRepository.findById(id)).get();
	}

}
