package com.bah.msd.customerapi.api;

import java.net.URI;

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

import com.bah.msd.customerapi.domain.Event;
import com.bah.msd.customerapi.service.EventService;

@RestController
@RequestMapping("/events")
public class EventEndpoint {
	@Autowired
	private EventService service;

	@GetMapping
	public Iterable<Event> all() {
		return service.findAll();
	}

	@GetMapping("/{eventId}")
	public Event getEventById(@PathVariable("eventId") long id) {
		return service.findById(id);
	}

	@PostMapping
	public ResponseEntity<?> addEvent(@RequestBody Event event, UriComponentsBuilder uri) {
		System.out.println("***** event" + event);
//		if (customer.getId()!=0 || customer.getName()==null || customer.getEmail() == null) {
//			reject - we'll assign the customer id
//			return ResponseEntity.badRequest().build();
//		}

		Event newEvent = service.save(event);
		System.out.println("***** new event " + newEvent);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(newEvent.getId()).toUri();
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
	public ResponseEntity<?> putEvent(
			@PathVariable long id,
			@RequestBody Event event) {
		System.out.println("***** updated event " + event + " eventID: " + id);
		Event newEvent = service.save(event);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEvent(
		@PathVariable long id) {
//		System.out.println("***** deleted customerId " + customerId;
		service.deleteEvent(id);
		return ResponseEntity.ok().build();
	}
}
