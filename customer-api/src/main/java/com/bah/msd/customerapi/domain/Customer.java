package com.bah.msd.customerapi.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {
	
	
	@Id
	// Mark the id field as the primary key
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Tell JPA how it's going to be generated
	private Long id;
	
	private String name;
	private String password;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public Customer(Long id, String name, String password, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.password = password;
//		this.email = email;
//	}
	
	@Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
	}
//	public Customer get() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}