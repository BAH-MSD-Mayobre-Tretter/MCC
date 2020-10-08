package com.bah.customerapi.api;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.customerapi.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@RequestMapping
	public Collection<Customer> getAllItems() {
		
	}
//	Need CRUD
//	CREATE
//	READ
	
}
