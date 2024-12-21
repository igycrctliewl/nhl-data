package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.junit.Test;

public class DateInstantExperimental {

	@Test
	public void testAssist() {

		String dateString = "2024-11-26T00:00:00Z";

		Instant instant = Instant.parse( dateString );

		LocalDateTime dateTime = instant.atZone( ZoneId.systemDefault() ).toLocalDateTime();
		
		assertNotNull( dateTime );

		Instant outInstant = dateTime.atZone( ZoneId.systemDefault() ).toInstant();

		assertNotNull( outInstant );

		assertEquals( instant, outInstant );
		assertEquals( dateString, outInstant.toString() );
	}

}
