package com.bah.msd.customerapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.customerapi.domain.Customer;
import com.bah.msd.customerapi.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerEndpoint {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public Iterable<Customer> all() {
		return customerService.findAll();
	}
	
//	@GetMapping("/echo")
//	public String echo() {
//		String echo = "Hello";
//		return echo;
//	}
	
	@GetMapping("/{id}")
	public Customer findById(@PathVariable long id) {
		System.out.println("findById: " + id);
		return customerService.findById(id);
	}
//	Need CRUD
//	CREATE
//	READ
	
}
