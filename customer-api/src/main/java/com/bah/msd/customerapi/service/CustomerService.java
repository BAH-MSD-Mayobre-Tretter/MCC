package com.bah.msd.customerapi.service;

import com.bah.msd.customerapi.domain.Customer;

public interface CustomerService {
	
	public Iterable<Customer> findAll();

	Customer findById(long id);
	
	Customer findByName(String name);

	public Customer save(Customer newCustomer);

	public int deleteById(long id);

	public int deleteByName(String name);
	
//	change deleteEvent to deleteId for all services

}
