package com.bah.msd.customerapi.service;

import com.bah.msd.customerapi.domain.Registration;

public interface RegistrationService {

	public Iterable<Registration> findAll();

	public Registration findById(long id);

	public Registration save(Registration registration);

	public void deleteRegistration(long id);
//	change deleteEvent to deleteId for all services

}
