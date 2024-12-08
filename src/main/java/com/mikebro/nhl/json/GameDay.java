package com.mikebro.nhl.json;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mikebro.jsonhelper.serializer.JsonDateDeserializer;
import com.mikebro.jsonhelper.serializer.JsonDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GameDay {

	@JsonSerialize(using = JsonDateSerializer.class)
	@JsonDeserialize(using = JsonDateDeserializer.class)
	private LocalDate date;

	private String dayAbbrev;

	private Integer numberOfGames;
}
