package com.example.demo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.models.Greeting;

@Service
public class GreetingService {
	
	private Greeting gEN;
	private Greeting gFR;
	private final SimpMessagingTemplate mt;
	
	public GreetingService(@Qualifier("en") Greeting gEN,@Qualifier("fr") Greeting gFR, SimpMessagingTemplate mt) {
		super();
		this.gEN = gEN;
		this.gFR = gFR;
		this.mt = mt;
	}

	public Greeting getInfo() {
		this.gEN.setCurrentTime();
		return this.gEN;
	}
	
	@Scheduled(fixedRate = 1000) // Runs every second
	public void updateSendGreeting() {
		gFR.setCurrentTime(); // Update current time
		mt.convertAndSend("/messages", gFR); // send to WebSocket topic /messages
	}
}