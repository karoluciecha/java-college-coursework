package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CounterService;

@RestController
public class MainController {

	CounterService cs;
	
	public MainController(CounterService cs) {
		super();
		this.cs = cs;
	}
	
	@GetMapping(path = "/increment")
	public int get() {
//		this.cs = new CounterService(0);
		return this.cs.incCounter();
	}
}
