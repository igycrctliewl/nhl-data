package com.mikebro.nhl.json;

import lombok.Data;

@Data
public class OddsPartner {
	private Integer partnerId;
	private String country;
	private String name;
	private String imageUrl;
	private String siteUrl;
	private String bgColor;
	private String textColor;
	private String accentColor;
}
