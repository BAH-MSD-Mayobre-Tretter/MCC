package com.bah.msd.customerapi.respository;

import org.springframework.data.repository.CrudRepository;


import com.bah.msd.customerapi.domain.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
//	public Customer createCustomer(Customer customer);
//	
//	public Customer findById(Long id);
//	
//	public Collection<Customer> findAll();
//	
//	public Collection<Customer> findByName(String name);
//	boolean existsByEmail(String email);
//	boolean existsByName(String name);

}
