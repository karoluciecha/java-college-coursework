package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {

	CustomerRepository cr;
	
	public CustomerService(CustomerRepository cr) {
		super();
		this.cr = cr;
	}

	public List<Customer> getAllCustomers() {
		return this.cr.findAll();
	}
}
