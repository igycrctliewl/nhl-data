package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class OddsPartner {
	Integer partnerId;
	String country;
	String name;
	String imageUrl;
	String siteUrl;
	String bgColor;
	String textColor;
	String accentColor;
}
