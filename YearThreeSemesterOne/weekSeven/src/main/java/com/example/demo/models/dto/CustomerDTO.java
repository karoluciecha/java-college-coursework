package com.example.demo.models.dto;

public class CustomerDTO {
	private String name;
	private String email;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}