package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class Team {
	private Integer id;
	private Name name;
	private String abbrev;
	private Integer score;
	private Integer sog;
	private String logo;
}
