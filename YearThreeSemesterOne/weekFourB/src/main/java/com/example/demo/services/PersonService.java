package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Person;

@Service
public class PersonService {

	private final List<Person> people = new ArrayList<>();
	
	public PersonService() {
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
	}
	
	public List<Person> getPeople() {
		return people;
	}
	
	public List<Person> addPerson(Person p) {
		people.add(p);
		return getPeople();
	}
}
