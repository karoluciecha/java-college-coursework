package com.example.demo.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;

@Service
public class CustomerQueueListener {
	
	@RabbitListener(queues = "customerQueue")
	public void custQueueMsg(Customer c) {
		System.out.println("Welcome RabbitMQ: " + c.getName() + ", " + c.getEmail());
	}

}