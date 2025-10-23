package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.CarI;


@RestController
@RequestMapping("/")
class MainController {
	
//	@GetMapping
//	public String get() {
//		return "OK";
//	}
//	
//	@GetMapping("/sports")
//	public String sp() {
//		return "Sports OK";
//	}
//	
//	@GetMapping("/groceries")
//	public String gr() {
//		return "Groceries OK";
//	}
	
//	private PetrolCar pc;
//	
//	public MainController(PetrolCar pc) {
//		super();
//		this.pc = pc;
//	}
	
	private CarI car;
	
	public MainController(@Qualifier("electric") CarI car) {
		super();
		this.car = car;
	}

	@GetMapping
	public String get() {
//		PetrolCar pc = new PetrolCar();
		car.setReg("252-G-12");
		return car.toString();
	}
}
