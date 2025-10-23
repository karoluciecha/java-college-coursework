package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.LanguageService;
import com.example.demo.services.TimeService;

@RestController
public class HelloController {
	
	// First method - through constructor
	TimeService ts;
	public HelloController(TimeService ts) {
		super();
		this.ts = ts;
	}

	// Second method - through autowiring
	@Autowired
	LanguageService ls;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, Spring Boot!";
	}
	
	@GetMapping("/time")
	public String time() {
		//this.ts = new TimeService();
		return "Good " + this.ts.getGreetingLocalTime() + "!";
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome to the Home Page!";
	}
	
	@GetMapping("/language")
	public String language() {
		return this.ls.getLanguageGreeting() + "\nGood " + this.ts.getGreetingLocalTime() + "!";
	}
}