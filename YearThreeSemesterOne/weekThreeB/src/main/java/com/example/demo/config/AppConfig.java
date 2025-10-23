package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import com.example.demo.services.CounterService;

@Configuration
public class AppConfig {

	@Bean
	@SessionScope
	CounterService counterService() {
		return new CounterService(0);
	}
}