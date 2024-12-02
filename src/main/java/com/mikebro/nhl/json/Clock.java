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

	String timeRemaining;

	Integer secondsRemaining;

	boolean running;

	boolean inIntermission;
}

