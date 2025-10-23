package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Person;
import com.example.demo.services.PersonService;

@RestController
public class MainController {

	private final PersonService ps;

	// Constructor Injection
	@Autowired
	public MainController(PersonService ps) {
		this.ps = ps;
	}

	// 1. Handle a POST mapping on /
	// Return a String
	// 2. Access the Request Body (@RequestBody) and convert it into Person object.
	// Return a String representation of Person object.
	// 3. Pass this Person object to a new method in the PersonService.
	// 4. In the PersonService add this new Person object to the existing list of
	// Person objects.
	// 5. Return the new list to the Controller.
	// 6. In the controller, return the new list to the client (Postman)

	@GetMapping("/")
	public List<Person> getPeople() {
		return ps.getPeople();
	}
	
	// Unique for each session
	// Postman: send get request with login info and security password to log in on /csrf-token
	// send post request with header X-CSRF-TOKEN and token displayed on /csrf-token page
	@GetMapping("/csrf-token")
	@ResponseBody
	public CsrfToken csrfToken(CsrfToken token) {
		return token;
	}

	@PostMapping("/")
	public List<Person> addPerson(@RequestBody Person p) {
		return ps.addPerson(p);
	}

}