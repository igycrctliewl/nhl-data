package com.mikebro.nhl.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Clock {

	private String timeRemaining;

	private Integer secondsRemaining;

	private boolean running;

	private boolean inIntermission;
}

