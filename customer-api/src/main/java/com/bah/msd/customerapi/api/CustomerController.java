package com.bah.msd.customerapi.api;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.msd.customerapi.domain.Customer;
import com.bah.msd.customerapi.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public Collection<Customer> getAllItems() {
		Collection<Customer> results = customerService.findAll();
		return results;
	}
	
	@GetMapping("/echo")
	public String echo() {
		String echo = "Hello";
		return echo;
	}
	
	@GetMapping
	public Customer findById(@PathParam("/{id}") long id) {
		return customerService.findById(id);
	}
//	Need CRUD
//	CREATE
//	READ
	
}
