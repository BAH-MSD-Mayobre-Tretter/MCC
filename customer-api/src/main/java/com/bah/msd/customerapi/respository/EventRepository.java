package com.bah.msd.customerapi.respository;

import com.bah.msd.customerapi.domain.Event;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
