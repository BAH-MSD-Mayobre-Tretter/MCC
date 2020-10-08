package com.bah.customerapi.respository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.bah.customerapi.domain.Customer;

@Repository
public interface CustomerRepository {
	public Customer createCustomer(Customer customer);
	
	public Customer findById(Long id);
	
	public Collection<Customer> findAll();
	
	public Collection<Customer> findByName(String name);

}
