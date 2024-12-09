package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class GameOutcomeTest {

	@Test
	public void testGameOutcome() {
		GameOutcome gameOutcome = GameOutcome.builder()
				.lastPeriodType( "REG" )
				.otPeriods( 0 )
				.build();

		assertEquals( "REG", gameOutcome.getLastPeriodType() );
		assertEquals( (Integer) 0, gameOutcome.getOtPeriods() );
	}


	@Test
	public void testGameOutcomeJson() {
		String json = "{\"lastPeriodType\":\"REG\",\"otPeriods\":0}";
		GameOutcome gameOutcome = JsonHelper.jsonToObject( json, GameOutcome.class);

		assertEquals( "REG", gameOutcome.getLastPeriodType() );
		assertEquals( (Integer) 0, gameOutcome.getOtPeriods() );

		String string = JsonHelper.objectToJson( gameOutcome );
		assertEquals( json, string );
	}

}

