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
	
	public Collection<Customer> findAll();
	
	public Collection<Customer> findByName(String name);
	
	public long size();
}