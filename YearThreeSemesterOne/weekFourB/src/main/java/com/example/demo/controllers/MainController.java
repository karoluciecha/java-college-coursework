package com.example.demo.controllers;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.Person;
import com.example.demo.services.PersonService;

@Controller
public class MainController {

	@Autowired
	private PersonService ps;
	
	@GetMapping("/")
	public String getName(Model m) {
		Calendar c = Calendar.getInstance();
		String name = "";
		if (c.get(Calendar.SECOND) % 2 == 0) {
			name = "John";
		}
		else {
			name = "Mary";
		}
		m.addAttribute("username", name);
		return "Index";
	}
	
	@GetMapping("/PeopleList")
	public String getList(Model m) {
		m.addAttribute("people", ps.getPeople());
		return "PeopleList";
	}
	
	@GetMapping("/NewPerson")
	public String newPersonForm() {
		return "NewPerson";
	}
	
	// Handles form data
	@PostMapping(value = "/NewPerson", consumes = "application/x-www-form-urlencoded")
	public String postForm(@ModelAttribute Person p) {
	    this.ps.addPerson(p);
	    return "redirect:/PeopleList";
	}

	// Handles JSON data
	@PostMapping(value = "/NewPerson", consumes = "application/json")
	public String postJSON(@RequestBody Person p) {
	    this.ps.addPerson(p);
	    return "redirect:/PeopleList";
	}

}
