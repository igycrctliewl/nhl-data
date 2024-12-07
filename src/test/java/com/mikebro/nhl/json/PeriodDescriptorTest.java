package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class PeriodDescriptorTest {

	@Test
	public void testPeriodDescriptor() {
		PeriodDescriptor period = PeriodDescriptor.builder()
				.number( 3 )
				.periodType( "REG" )
				.maxRegulationPeriods( 3 )
				.build();

		assertEquals( (Integer) 3, period.getNumber() );
		assertEquals( "REG", period.getPeriodType() );
		assertEquals( (Integer) 3, period.getMaxRegulationPeriods() );
	}


	@Test
	public void testGameDayJson() {
		String json = "{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3}";
		PeriodDescriptor period = JsonHelper.jsonToObject( json, PeriodDescriptor.class);

		assertEquals( (Integer) 3, period.getNumber() );
		assertEquals( "REG", period.getPeriodType() );
		assertEquals( (Integer) 3, period.getMaxRegulationPeriods() );

		String periodString = JsonHelper.objectToJson( period );
		assertEquals( json, periodString );
	}

}
