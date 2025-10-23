package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;
import com.example.demo.services.RequestService;

@RestController
@RequestMapping("/")
public class MainController {

    private final PersonRepository personRepository;
	
	@Autowired
	RequestService rq;

    MainController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
	
	@GetMapping
	public List<Person> get() {
		return this.rq.getRequest();
	}
	
	@PostMapping
	public void post(@RequestBody Person p) {
		this.rq.postRequest(p);
		
	}

}
