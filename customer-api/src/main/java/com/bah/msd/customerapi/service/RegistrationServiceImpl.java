package com.bah.msd.customerapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bah.msd.customerapi.domain.Registration;
import com.bah.msd.customerapi.respository.RegistrationRepository;

public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationRepository repository;

	@Override
	public Iterable<Registration> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Registration findById(long id) {
		// TODO Auto-generated method stub
		return (repository.findById(id)).get();
	}

	@Override
	public Registration save(Registration registration) {
		// TODO Auto-generated method stub
		return repository.save(registration);
	}

	@Override
	public void deleteRegistration(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
