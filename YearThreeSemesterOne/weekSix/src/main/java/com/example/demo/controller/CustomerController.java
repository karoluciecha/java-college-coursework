package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return this.cs.getAllCustomers();
	}
}
