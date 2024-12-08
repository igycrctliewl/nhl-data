package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class VenueTest {

	@Test
	public void testVenue() {
		Venue venue = Venue.builder()
				.name( "Saddledome" )
				.build();

		assertEquals( "Saddledome", venue.getName() );
	}


	@Test
	public void testVenueJson() {
		String json = "{\"default\":\"Saddledome\"}";
		Venue venue = JsonHelper.jsonToObject( json, Venue.class);

		assertEquals( "Saddledome", venue.getName() );

		String string = JsonHelper.objectToJson( venue );
		assertEquals( json, string );
	}

}
