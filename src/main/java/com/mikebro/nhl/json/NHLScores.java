package com.mikebro.nhl.json;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class NHLScores {
	LocalDate prevDate;
	LocalDate currentDate;
	LocalDate nextDate;
//	List<Object> gameWeek;
//	List<Object> oddsPartners;
//	List<Object> games;
}
