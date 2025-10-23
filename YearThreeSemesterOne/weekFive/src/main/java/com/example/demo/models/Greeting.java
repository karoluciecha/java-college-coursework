package com.example.demo.models;

import java.util.Calendar;

public class Greeting {
	private String greeting;
	private String currentTime;

	public Greeting(String greeting) {
		super();
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime() {
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR_OF_DAY);
		int m = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		this.currentTime = h + ":" + m + ":" + s;
	}

	@Override
	public String toString() {
		return "Greeting [greeting=" + greeting + ", currentTime=" + currentTime + "]";
	}
}