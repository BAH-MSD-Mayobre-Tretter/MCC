package com.bah.customerapi.respository;

import java.util.*;

import com.bah.customerapi.domain.Customer;

public interface CustomerRepository {
	public Customer createCustomer(Customer customer);
	
	public Customer findById(Long id);
	
	public Collection<Customer> findAll();
	
	public Collection<Customer> findByName(String name);
}
