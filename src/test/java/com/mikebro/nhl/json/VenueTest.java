package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

/**
 * Tests for Name class when used as the name of a venue
 * @author mikebro
 *
 */
public class VenueTest {

	@Test
	public void testVenue() {
		Name venue = Name.builder()
				.name( "Saddledome" )
				.build();

		assertEquals( "Saddledome", venue.getName() );
	}


	@Test
	public void testVenueJson() {
		String json = "{\"default\":\"Saddledome\"}";
		Name venue = JsonHelper.jsonToObject( json, Name.class);

		assertEquals( "Saddledome", venue.getName() );

		String string = JsonHelper.objectToJson( venue );
		assertEquals( json, string );
	}

}
