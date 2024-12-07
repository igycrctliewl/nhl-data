package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class Goal {
	Integer period;
	PeriodDescriptor periodDescriptor;
	String timeInPeriod;
	Long playerId;
	Name name;
	Name firstName;
	Name lastName;
	String goalModifier;
	
	String mugshot;
	String teamAbbrev;
	Integer goalsToDate;
	Integer awayScore;
	Integer homeScore;
	String strength;
	Long highlightClip;
}
