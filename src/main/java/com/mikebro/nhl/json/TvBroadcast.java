package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class TvBroadcast {
	private Integer id;
	private String market;
	private String countryCode;
	private String network;
	private Integer sequenceNumber;
}
