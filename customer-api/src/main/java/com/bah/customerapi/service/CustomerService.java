package com.bah.customerapi.service;

import java.util.Collection;

import com.bah.customerapi.domain.Customer;

public interface CustomerService {
	
	public Customer findById(Long id);
	
	public Collection<Customer> findAll();
	
	public Collection<Customer> findByName(String name);
	
	public long size();
}
