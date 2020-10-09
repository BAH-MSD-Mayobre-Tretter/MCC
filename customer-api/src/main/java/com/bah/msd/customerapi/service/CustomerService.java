package com.bah.msd.customerapi.service;

import com.bah.msd.customerapi.domain.Customer;

public interface CustomerService {
	
	public Iterable<Customer> findAll();

	Customer findById(long id);

	public Customer save(Customer newCustomer);

	public int deleteById(long id);

	public int deleteByName(String name);
	
	
	/*
	 * public void SaveCustomer(Customer customer);
	 * public Optional<Purchase> findCustomerById(long id);
	 */

}
