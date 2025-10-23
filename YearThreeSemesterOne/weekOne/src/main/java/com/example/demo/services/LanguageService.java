package com.example.demo.services;

// import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

	// Value way to do things
	// @Value("${app.language}")
	// private String lang;
	
	// Environment way to do things
	private final Environment env;
	
	public LanguageService(Environment env) {
		this.env = env;
	}
	
	public String getLanguageGreeting() {

		// Get the value, or null if it doesn't exist
        String lang = env.getProperty("app.language");
        if (lang == null) return "Hello! :)"; // Default fallback
		if (lang.equalsIgnoreCase("Spanish")) return "Hola! :)";
		if (lang.equalsIgnoreCase("French")) return "Bonjour! :)";
		if (lang.equalsIgnoreCase("Polish")) return "Cześć! :)";
		return "Hello! :)";
	}
}
