package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Person;
import com.example.demo.repositories.PersonRepository;

@Service
public class RequestService {

	PersonRepository pr;

	public RequestService(PersonRepository pr) {
		super();
		this.pr = pr;
	}

	public List<Person> getRequest() {
		return this.pr.findAll();
	}
	
	public void postRequest(Person p) {
		if (p.getAge() > 18) {
			this.pr.save(p);
		}
	}
}
