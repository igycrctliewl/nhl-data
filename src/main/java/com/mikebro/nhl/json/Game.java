package com.mikebro.nhl.json;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mikebro.jsonhelper.serializer.LocalDateDeserializer;
import com.mikebro.jsonhelper.serializer.LocalDateSerializer;
import com.mikebro.jsonhelper.serializer.LocalDateTimeDeserializer;
import com.mikebro.jsonhelper.serializer.LocalDateTimeSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

	private Integer id;

	private Integer season;

	private Integer gameType;

	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate gameDate;

	private Name venue;

	@JsonProperty("startTimeUTC")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime startTime;

	private String easternUTCOffset;

	private String venueUTCOffset;

	private List<TvBroadcast> tvBroadcasts;

	private String gameState;

	private String gameScheduleState;

	private Team awayTeam;

	private Team homeTeam;

	private String gameCenterLink;

	private String 	threeMinRecap;

	private String threeMinRecapFr;

	private String condensedGame;

	private String condensedGameFr;

	private Clock clock;

	private boolean neutralSite;

	private String venueTimezone;

	private Integer period;

	private PeriodDescriptor periodDescriptor;

	private GameOutcome gameOutcome;

	private List<Goal> goals;
}
