package com.mikebro.nhl.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Goal {
	private Integer period;
	private PeriodDescriptor periodDescriptor;
	private String timeInPeriod;
	private Long playerId;
	private Name name;
	private Name firstName;
	private Name lastName;
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
