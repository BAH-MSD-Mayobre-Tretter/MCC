package com.bah.msd.customerapi.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.bah.msd.customerapi.respository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerEndpoint {

	@Autowired
	CustomerRepository repo;

	@GetMapping
	public Iterable<Customer> all() {
		return repo.findAll();
	}

	@GetMapping("/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable("customerId") long id) {
		return repo.findById(id);
	}
	
	@GetMapping("/byname/{customerName}")
	public Customer getCustomerByName(@PathVariable("customerName") String name) {
		return repo.findByName(name);
	}

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer, UriComponentsBuilder uri) {
		System.out.println("***** customer " + customer);
		if (customer.getId()!=0 || customer.getName()==null || customer.getEmail() == null) {
//			reject - we'll assign the customer id
			return ResponseEntity.badRequest().build();
		}

		Customer newCustomer = repo.save(customer);
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
	
	@PutMapping("/{id}")
	public ResponseEntity<?> putCustomer(
			@PathVariable long id,
			@RequestBody Customer customer) {
		System.out.println("***** updated customer " + customer + " customerId: " + id);
		Customer newCustomer = repo.save(customer);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCustomer(
		@PathVariable long id) {
//		System.out.println("***** deleted customerId " + customerId;
		Long results = repo.deleteById(id);
		System.out.println("**** customer id deleted: " + id + " - " + results);
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
