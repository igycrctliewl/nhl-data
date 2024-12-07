package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class GameDayTest {

	@Test
	public void testGameDay() {
		GameDay day = GameDay.builder()
				.date( LocalDate.parse( "2024-11-22" ) )
				.dayAbbrev( "FRI" )
				.numberOfGames( 2 )
				.build();

		assertEquals( "2024-11-22", day.getDate().toString() );
		assertEquals( "FRI", day.getDayAbbrev() );
		assertEquals( (Integer) 2, day.getNumberOfGames() );
	}


	@Test
	public void testGameDayJson() {
		String json = "{\"date\":\"2024-11-22\",\"dayAbbrev\":\"FRI\",\"numberOfGames\":2}";
		GameDay day = JsonHelper.jsonToObject( json, GameDay.class);

		assertEquals( LocalDate.parse( "2024-11-22" ), day.getDate() );
		assertEquals( "FRI", day.getDayAbbrev() );
		assertEquals( (Integer) 2, day.getNumberOfGames() );

		String dayString = JsonHelper.objectToJson( day );
		assertEquals( json, dayString );
	}

}
