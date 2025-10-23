package com.example.demo.services;

import java.time.LocalTime;
import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

	public String getGreetingLocalTime() {
        LocalTime now = LocalTime.now();

        if (now.isBefore(LocalTime.NOON)) { // (12:00am to 11:59am)
            return "morning";
        } else if (now.isBefore(LocalTime.of(17, 0))) { // (12:00pm to 4:59pm)
            return "afternoon";
        } else if (now.isBefore(LocalTime.of(21, 0))) { // (5:00pm to 8:59pm)
            return "evening";
        } else {
            // From 9:00pm to 11:59pm
            return "night";
        }
	}
	
	public String getGreetingCalendar() {
        Calendar c = Calendar.getInstance();
        
        int hour = c.get(Calendar.HOUR_OF_DAY);
        if (hour >= 0 && hour < 12) return "morning";
        if (hour >=12 && hour < 17) return "afternoon";
        if (hour >=17 && hour < 21) return "evening";
        return "night";
	}
}