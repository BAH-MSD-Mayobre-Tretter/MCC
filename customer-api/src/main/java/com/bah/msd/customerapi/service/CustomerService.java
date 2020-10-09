package com.bah.msd.customerapi.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.bah.msd.customerapi.domain.Customer;

// PROXY Pattern
// IoC
// Interface Driven Design

// Contract Obligation

public interface CustomerService {
	
	public Iterable<Customer> findAll();

	Customer findById(long id);
	
	
	/*
	 * public void SaveCustomer(Customer customer);
	 * public Optional<Purchase> findCustomerById(long id);
	 */

}
