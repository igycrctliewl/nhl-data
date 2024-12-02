package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class Goal {
	Integer period;
	Period periodDescriptor;
	String timeInPeriod;
	Long playerId;
	Name name;
	String mugshot;
	String teamAbbrev;
	Integer goalsToDate;
	Integer awayScore;
	Integer homeScore;
	String strength;
	Long highlightClip;
}
