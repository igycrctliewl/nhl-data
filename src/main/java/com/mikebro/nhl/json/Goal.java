package com.mikebro.nhl.json;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Goal {
	private Integer period;
	private PeriodDescriptor periodDescriptor;
	private String timeInPeriod;
	private Long playerId;
	private Player name;
	private Player firstName;
	private Player lastName;
	private String goalModifier;
	private List<Assist> assists;
	private String mugshot;
	private String teamAbbrev;
	private Integer goalsToDate;
	private Integer awayScore;
	private Integer homeScore;
	private String strength;
	private String highlightClipSharingUrl;
	private String highlightClipSharingUrlFr;
	private Long highlightClip;
	private Long highlightClipFr;
	private Long discreteClip;
	private Long discreteClipFr;
}
