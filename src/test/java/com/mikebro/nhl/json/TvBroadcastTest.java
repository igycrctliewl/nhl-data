package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class TvBroadcastTest {

	@Test
	public void testTvBroadcast() {
		TvBroadcast tvBroadcast = TvBroadcast.builder()
				.id( 548 )
				.market( "N" )
				.countryCode( "CA" )
				.network( "Prime" )
				.sequenceNumber( 105 )
				.build();

		assertEquals( (Integer) 548, tvBroadcast.getId() );
		assertEquals( "N", tvBroadcast.getMarket() );
		assertEquals( "CA", tvBroadcast.getCountryCode() );
		assertEquals( "Prime", tvBroadcast.getNetwork() );
		assertEquals( (Integer) 105, tvBroadcast.getSequenceNumber() );
	}


	@Test
	public void testTvBroadcastJson() {
		String json = "{\"id\":548,\"market\":\"N\",\"countryCode\":\"CA\",\"network\":\"Prime\",\"sequenceNumber\":105}";
		TvBroadcast tvBroadcast = JsonHelper.jsonToObject( json, TvBroadcast.class);

		assertEquals( (Integer) 548, tvBroadcast.getId() );
		assertEquals( "N", tvBroadcast.getMarket() );
		assertEquals( "CA", tvBroadcast.getCountryCode() );
		assertEquals( "Prime", tvBroadcast.getNetwork() );
		assertEquals( (Integer) 105, tvBroadcast.getSequenceNumber() );

		String string = JsonHelper.objectToJson( tvBroadcast );
		assertEquals( json, string );
	}

}
