package com.mikebro.nhl.json;

import java.util.List;

import lombok.Data;

@Data
public class Broadcasters {
	private List<TvBroadcast> tvBroadcasts;
}
