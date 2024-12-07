package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player player = Player.builder()
				.name( "Z. Girgensons" )
				.build();

		assertEquals( "Z. Girgensons", player.getName() );
	}


	@Test
	public void testPlayerJson() {
		String json = "{\"default\":\"Z. Girgensons\"}";
		Player player = JsonHelper.jsonToObject( json, Player.class);

		assertEquals( "Z. Girgensons", player.getName() );

		String string = JsonHelper.objectToJson( player );
		assertEquals( json, string );
	}

}
