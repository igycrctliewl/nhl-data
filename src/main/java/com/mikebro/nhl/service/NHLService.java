package com.mikebro.nhl.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.mikebro.nhl.json.Schedule;

@Service
public interface NHLService {

	/**
	 * Get the NHL schedule for a given date.
	 * @param the date you want to generate an NHL schedule
	 * @return the fully-populated NHL Schedule object
	 */
	public Schedule getSchedule(LocalDate effdt);

	/**
	 * Get the NHL schedule for the current date.
	 * @return the fully-populated NHL Schedule object
	 */
	public Schedule getTodaySchedule();

}
