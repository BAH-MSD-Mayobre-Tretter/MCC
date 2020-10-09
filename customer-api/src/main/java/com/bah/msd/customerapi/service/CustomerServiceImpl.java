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

	@Override
	public Customer save(Customer newCustomer) {
		// TODO Auto-generated method stub
		return customerRepository.save(newCustomer);
	}

	@Override
	public int deleteByName(String name) {
		// TODO Auto-generated method stub
		return customerRepository.deleteByName(name);
	}

	@Override
	public int deleteById(long id) {
		// TODO Auto-generated method stub
		return customerRepository.deleteById(id);
	}

}
