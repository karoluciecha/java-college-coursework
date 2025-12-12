package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class CountService {

	private int counter = 0;

	public CountService() {
		this.counter = 0;
	}

	public int addOne() {
		counter++;
		return counter;
	}
}
