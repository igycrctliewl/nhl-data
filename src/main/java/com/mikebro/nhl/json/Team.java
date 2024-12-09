package com.mikebro.nhl.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	private Integer id;
	private Name name;
	private String abbrev;
	private Integer score;
	private Integer sog;
	private String logo;
}
