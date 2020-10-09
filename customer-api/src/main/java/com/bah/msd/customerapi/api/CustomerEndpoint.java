package com.bah.msd.customerapi.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

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

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") long id) {
		return customerService.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer, UriComponentsBuilder uri) {
		System.out.println("***** customer " + customer);
//		if (customer.getId()!=0 || customer.getName()==null || customer.getEmail() == null) {
//			reject - we'll assign the customer id
//			return ResponseEntity.badRequest().build();
//		}

		Customer newCustomer = customerService.save(customer);
		System.out.println("***** new customer " + newCustomer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newCustomer.getId()).toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		return response;
	}

//	@PutMapping
//	public ResponseEntity<?> putCustomer(@RequestBody Customer customer) {
//		System.out.println("***** updated customer " + customer);
//
//		Customer newCustomer = customerService.save(customer);
//		System.out.println("***** new customer " + newCustomer);
//		return ResponseEntity.ok().build();
//	}
	
	@PutMapping
	public ResponseEntity<?> putCustomer(
			@RequestBody Customer customer) {
		System.out.println("***** updated customer " + customer);
		Customer newCustomer = customerService.save(customer);
		System.out.println("***** new customer " + newCustomer);
		return ResponseEntity.ok().build();
	}

//	@GetMapping("/echo")
//	public String echo() {
//		String echo = "Hello";
//		return echo;
//	}

//	@GetMapping("/{id}")
//	public Customer findById(@PathVariable long id) {
//		System.out.println("findById: " + id);
//		return customerService.findById(id);
//	}
//	Need CRUD
//	CREATE
//	READ

}
