package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.Customer;

@FeignClient(name = "customer-welcome", url = "http://localhost:8082")
public interface WelcomeClient {
	
	@PostMapping("/welcome")
	void sendCustomer(@RequestBody Customer c);

}
