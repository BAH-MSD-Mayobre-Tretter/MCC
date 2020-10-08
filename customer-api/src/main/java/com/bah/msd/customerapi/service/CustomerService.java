package com.bah.msd.customerapi.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.bah.msd.customerapi.domain.Customer;

// PROXY Pattern
// IoC
// Interface Driven Design

// Contract Obligation

@Service
public interface CustomerService {
	
	public Customer findById(Long id);
	
	public Iterable<Customer> findAll();
	
	public Iterable<Customer> findByName(String name);

}
