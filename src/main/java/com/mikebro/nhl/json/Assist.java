package com.mikebro.nhl.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Assist {

	private Long playerId;

	private Player name;

	private Integer assistsToDate;
}
