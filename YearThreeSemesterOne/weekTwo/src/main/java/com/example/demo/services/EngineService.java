package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class EngineService {
	
	public EngineService(int x) { // Cannot pass object that are not Spring Beans
		super();
	}
	
	public EngineService() {
		super();
	}
}