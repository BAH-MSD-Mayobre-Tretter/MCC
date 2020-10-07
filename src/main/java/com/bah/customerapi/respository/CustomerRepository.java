package com.bah.customerapi.respository;

public interface CustomerRepository {
	Customer createCustomer(Customer customer);
	
	Customer findById(Long id);
}
