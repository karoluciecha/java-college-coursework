package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Greeting;
import com.example.demo.services.GreetingService;

@RestController
public class MainController {
	
	@Autowired
	GreetingService gs;
	
	@GetMapping("/")
	public String getGreeting() {
		Greeting greeting = gs.getInfo();
		return greeting.toString();
	}
}