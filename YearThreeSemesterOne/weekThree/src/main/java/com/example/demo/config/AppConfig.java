package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.CounterService;

@Configuration
public class AppConfig {

	@Bean
	CounterService counterService() {
		return new CounterService(0);
	}
}