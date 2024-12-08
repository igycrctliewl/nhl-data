package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class AssistTest {

	@Test
	public void testAssist() {
		Assist assist = Assist.builder()
				.playerId( 8476878L )
				.name( Player.builder()
						.name( "Z. Girgensons" )
						.build() )
				.assistsToDate( 1 )
				.build();

		assertEquals( (Long) 8476878L, assist.getPlayerId() );
		assertEquals( "Z. Girgensons", assist.getName().getName() );
		assertEquals( (Integer) 1, assist.getAssistsToDate() );
	}


	@Test
	public void testAssistJson() {
		String json = "{\"playerId\":8476878,\"name\":{\"default\":\"Z. Girgensons\"},\"assistsToDate\":1}";
		Assist assist = JsonHelper.jsonToObject( json, Assist.class);

		assertEquals( (Long) 8476878L, assist.getPlayerId() );
		assertEquals( "Z. Girgensons", assist.getName().getName() );
		assertEquals( (Integer) 1, assist.getAssistsToDate() );

		String string = JsonHelper.objectToJson( assist );
		assertEquals( json, string );
	}

}
