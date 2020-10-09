package com.bah.msd.customerapi.api;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.bah.msd.customerapi.domain.Registration;
import com.bah.msd.customerapi.service.RegistrationService;

@RestController
@RequestMapping("/registrations")
public class RegistrationEndpoint {

		@Autowired
		private RegistrationService service;

		@GetMapping("/")
		public Iterable<Registration> all() {
			return service.findAll();
		}

		@GetMapping("/{registrationId}")
		public Registration getRegistrationById(@PathVariable("registrationId") long id) {
			return service.findById(id);
		}

		@PostMapping
		public ResponseEntity<?> addRegistration(@RequestBody Registration registration, UriComponentsBuilder uri) {
			System.out.println("***** registration" + registration);
//			if (customer.getId()!=0 || customer.getName()==null || customer.getEmail() == null) {
//				reject - we'll assign the customer id
//				return ResponseEntity.badRequest().build();
//			}

			Registration newRegistration = service.save(registration);
			System.out.println("***** new registration " + newRegistration);
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(newRegistration.getId()).toUri();
			ResponseEntity<?> response = ResponseEntity.created(location).build();
			return response;
		}

//		@PutMapping
//		public ResponseEntity<?> putCustomer(@RequestBody Customer customer) {
//			System.out.println("***** updated customer " + customer);
	//
//			Customer newCustomer = customerService.save(customer);
//			System.out.println("***** new customer " + newCustomer);
//			return ResponseEntity.ok().build();
//		}
		
		@PutMapping
		public ResponseEntity<?> putRegistration(
				@RequestBody Registration registration) {
			System.out.println("***** updated registration " + registration);
			Registration newRegistration = service.save(registration);
			return ResponseEntity.ok().build();
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteRegistration(
			@PathVariable long id) {
//			System.out.println("***** deleted customerId " + customerId;
			service.deleteRegistration(id);
			return ResponseEntity.ok().build();
		}
}
