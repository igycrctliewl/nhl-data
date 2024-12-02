package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class Team {
	Integer id;
	Name name;
	String abbrev;
	Integer score;
	Integer sog;
	String logo;
}
