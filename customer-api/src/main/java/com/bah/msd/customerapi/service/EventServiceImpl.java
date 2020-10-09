package com.bah.msd.customerapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bah.msd.customerapi.domain.Event;
import com.bah.msd.customerapi.respository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository repository;

	@Override
	public Iterable<Event> findAll() {
		return repository.findAll();
	}

	@Override
	public Event findById(long id) {
		return (repository.findById(id)).get();
	}

	@Override
	public Event save(Event event) {
		return repository.save(event);
	}

	@Override
	public void deleteEvent(long id) {
		repository.deleteById(id);
	}

}
