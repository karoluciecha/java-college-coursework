package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.services.WelcomeService;

@RestController
public class MainController {
	
	WelcomeService ws;
	
	public MainController(WelcomeService ws) {
		super();
		this.ws = ws;
	}

	@PostMapping("/welcome")
	public void post(@RequestBody Customer c) {
		this.ws.welcome(c);
	}
}
