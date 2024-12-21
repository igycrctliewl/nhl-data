package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

/**
 * Tests for Name class when used as a player's name
 * @author mikebro
 *
 */
public class PlayerTest {

	@Test
	public void testPlayer() {
		Name player = Name.builder()
				.name( "J. Iginla" )
				.build();

		Name firstName = Name.builder()
				.name( "Jarome" )
				.build();

		Name lastName = Name.builder()
				.name( "Iginla" )
				.build();

		assertEquals( "J. Iginla", player.getName() );
		assertEquals( "Jarome", firstName.getName() );
		assertEquals( "Iginla", lastName.getName() );
	}


	@Test
	public void testPlayerJson() {
		String json = "{\"default\":\"Z. Girgensons\"}";
		Name player = JsonHelper.jsonToObject( json, Name.class);

		assertEquals( "Z. Girgensons", player.getName() );

		String string = JsonHelper.objectToJson( player );
		assertEquals( json, string );
	}

}
