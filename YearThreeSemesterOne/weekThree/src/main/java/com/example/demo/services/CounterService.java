package com.example.demo.services;

public class CounterService {
	public int counter;

	
	public CounterService(int counter) {
		super();
		this.counter = counter;
	}

	public int incCounter() {
		return ++counter;
	}
}