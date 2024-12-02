package com.mikebro.nhl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * <p>This is used by the NHL api for both player names and the "names" of buildings.</p>
 * <p>The default value is the English-language spelling of the name.  The data may contain other
 * national spellings, such as Swedish or Czech, but these are currently ignored by this class.
 * They may be added in a future enhancement.</p>
 * 
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {
	@JsonProperty("default")
	String name;
}
