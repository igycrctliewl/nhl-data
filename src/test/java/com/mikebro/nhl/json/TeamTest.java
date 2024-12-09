package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class TeamTest {

	@Test
	public void testTeam() {
		Team team = Team.builder()
				.id( 20 )
				.name( Name.builder()
						.name( "Flames" )
						.build() )
				.abbrev( "CGY" )
				.score( 3 )
				.sog( 27 )
				.logo( "https://assets.nhle.com/logos/nhl/svg/CGY_light.svg" )
				.build();

		assertEquals( (Integer) 20, team.getId() );
		assertEquals( "Flames", team.getName().getName() );
		assertEquals( "CGY", team.getAbbrev() );
		assertEquals( (Integer) 3, team.getScore() );
		assertEquals( (Integer) 27, team.getSog() );
		assertEquals( "https://assets.nhle.com/logos/nhl/svg/CGY_light.svg", team.getLogo() );
	}


	@Test
	public void testTeamJson() {
		String json = "{\"id\":20,\"name\":{\"default\":\"Flames\"},\"abbrev\":\"CGY\",\"score\":3,\"sog\":27,\"logo\":\"https://assets.nhle.com/logos/nhl/svg/CGY_light.svg\"}";
		Team team = JsonHelper.jsonToObject( json, Team.class);

		assertEquals( (Integer) 20, team.getId() );
		assertEquals( "Flames", team.getName().getName() );
		assertEquals( "CGY", team.getAbbrev() );
		assertEquals( (Integer) 3, team.getScore() );
		assertEquals( (Integer) 27, team.getSog() );
		assertEquals( "https://assets.nhle.com/logos/nhl/svg/CGY_light.svg", team.getLogo() );

		String string = JsonHelper.objectToJson( team );
		assertEquals( json, string );
	}

}
