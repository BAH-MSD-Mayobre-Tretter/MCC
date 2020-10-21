package com.bah.msd.customerapi.service;

import com.bah.msd.customerapi.domain.Event;

public interface EventService {
	
	public Iterable<Event> findAll();
	
	public Event findById(long id);
	
	public Event save(Event event);
	
	public void deleteEvent(long id);
	
	
//	change deleteEvent to deleteId for all services

}
