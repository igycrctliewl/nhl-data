package com.mikebro.nhl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * <p>This is used by the NHL api for both player names and the "names" of buildings.</p>
 * <p>The default value is the English-language spelling of the name.  Several other
 * languages are included here.  I suppose since I only speak English, I probably won't
 * be using these other languages.  I guess I was doing it just to see if I could.</p>
 * 
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

	@JsonProperty("default")
	private String name;

	@JsonInclude(Include.NON_NULL)
	private String cs;

	@JsonInclude(Include.NON_NULL)
	private String de;

	@JsonInclude(Include.NON_NULL)
	private String es;

	@JsonInclude(Include.NON_NULL)
	private String fi;

	@JsonInclude(Include.NON_NULL)
	private String fr;

	@JsonInclude(Include.NON_NULL)
	private String sk;

	@JsonInclude(Include.NON_NULL)
	private String sv;

	@Override
	public String toString() {
		return ( this.name == null ? "" : this.name );
	}
}
