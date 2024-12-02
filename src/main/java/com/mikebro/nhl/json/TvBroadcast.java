package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class TvBroadcast {
	Integer id;
	String market;
	String countryCode;
	String network;
	Integer sequenceNumber;
}
