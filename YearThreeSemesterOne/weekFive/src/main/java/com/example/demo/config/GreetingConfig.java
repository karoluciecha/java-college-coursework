package com.example.demo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Greeting;

@Configuration
public class GreetingConfig {

	@Bean
	@Qualifier("en")
	public Greeting greetingEN() {
		return new Greeting("Hello");
	}
	
	@Bean
	@Qualifier("fr")
	public Greeting greetingFR() {
		return new Greeting("Bonjour");
	}
}