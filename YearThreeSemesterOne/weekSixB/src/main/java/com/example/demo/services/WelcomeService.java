package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;

@Service
public class WelcomeService {

	public void welcome(Customer c) {
		System.out.println("Welcome, " + c.getName() + " (" + c.getEmail() + ")!");
	}
}
