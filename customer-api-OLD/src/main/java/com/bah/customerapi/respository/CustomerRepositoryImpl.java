package com.bah.customerapi.respository;

import java.util.*;

import com.bah.customerapi.domain.Customer;

public abstract class CustomerRepositoryImpl implements CustomerRepository {

	private List<Customer> customerData = new ArrayList<>(Arrays.asList(
			new Customer(1L, "Bob", "pass", "bob@mail.com"),
			new Customer(2L, "Larry", "pass", "larry@mail.com"),
			new Customer(3L, "Sally", "pass", "sally@mail.com")
		));

	public List<Customer> getCustomerData() {
		return customerData;
	}

	public void setCustomerData(List<Customer> customerData) {
		this.customerData = customerData;
	}
}
