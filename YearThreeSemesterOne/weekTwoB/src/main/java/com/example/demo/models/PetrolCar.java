package com.example.demo.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.interfaces.CarI;

@Configuration
@Primary
public class PetrolCar implements CarI {

	private String reg;
	
	@Override
	public void setReg(String reg) {
		this.reg = reg;
	}

	@Override
	public String getReg() {
		return this.reg;
	}

	@Override
	public String toString() {
		return "PetrolCar [reg=" + reg + "]";
	}

}
