package com.bah.customerapi.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.customerapi.domain.Customer;
import com.bah.customerapi.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public Collection<Customer> getAllItems() {
		Collection<Customer> results = customerService.findAll();
		return results;
	}
//	Need CRUD
//	CREATE
//	READ
	
}
