package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class ClockTest {

	@Test
	public void testClock() {
		Clock clock = Clock.builder()
				.inIntermission(false)
				.running(false)
				.secondsRemaining(180)
				.timeRemaining("03:00")
				.build();

		assertFalse( clock.isInIntermission() );
		assertFalse( clock.isRunning() );
		assertEquals( (Integer) 180, clock.getSecondsRemaining() );
		assertEquals( "03:00", clock.getTimeRemaining() );
	}


	@Test
	public void testClockJson() {
		String json = "{\"timeRemaining\":\"01:04\",\"secondsRemaining\":64,\"running\":true,\"inIntermission\":true}";
		Clock clock = JsonHelper.jsonToObject(json, Clock.class);

		assertTrue( clock.isInIntermission() );
		assertTrue( clock.isRunning() );
		assertEquals( (Integer) 64, clock.getSecondsRemaining() );
		assertEquals( "01:04", clock.getTimeRemaining() );
	}

}
