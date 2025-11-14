package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.models.dto.CustomerDTO;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {

	CustomerService cs;
	RabbitTemplate rt;
	ModelMapper mm;
	
	public CustomerController(CustomerService cs, RabbitTemplate rt, ModelMapper mm) {
		super();
		this.cs = cs;
		this.rt = rt;
		this.mm = mm;
	}

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return this.cs.getAllCustomers();
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> post(@RequestBody Customer c) {
		try {
			this.cs.postAddCustomers(c);
//			Convert Customer to CustomerDTO manually:
//			CustomerDTO customerDTO = new CustomerDTO(c.getName(), c.getEmail());
			CustomerDTO customerDTO = mm.map(c, CustomerDTO.class);
			this.rt.convertAndSend("customerQueue", customerDTO);
			return ResponseEntity
					.status(HttpStatus.ACCEPTED)
					.body(c);
		} catch (Exception e) {
			return ResponseEntity
			.status(HttpStatus.SERVICE_UNAVAILABLE)
			.body(null);
		}
	}
}