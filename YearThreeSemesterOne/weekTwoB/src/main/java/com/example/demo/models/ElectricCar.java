package com.example.demo.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.CarI;

@Component
@Qualifier("electric")
public class ElectricCar implements CarI {

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
		return "ElectricCar [reg=" + reg + "]";
	}

}
