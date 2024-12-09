package com.mikebro.nhl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.junit.Test;

import com.mikebro.jsonhelper.JsonHelper;

public class GameTest {

	@Test
	public void testGame() {
		Game game = Game.builder()
				.id( 2024020340 )
				.season( 20242025 )
				.gameType( 2 )
				.gameDate( LocalDate.parse( "2024-11-25" ) )
				.venue( Name.builder()
						.name( "Kanata, ON" )
						.build() )
				.startTime( LocalDateTime.parse( "2024-11-25T16:30:00" ) )
				.easternUTCOffset( "-05:00" )
				.venueUTCOffset( "-05:00" )
				.tvBroadcasts( Arrays.asList(
						TvBroadcast.builder()
								.id( 548 )
								.market( "N" )
								.countryCode( "CA" )
								.network( "Prime" )
								.sequenceNumber( 105 )
								.build() )
						)
				.gameState( "OFF" )
				.gameScheduleState( "OK" )
				.awayTeam( Team.builder()
						.id( 20 )
						.name( Name.builder()
								.name( "Flames" )
								.build() )
						.abbrev( "CGY" )
						.score( 3 )
						.sog( 27 )
						.logo( "https://assets.nhle.com/logos/nhl/svg/CGY_light.svg" )
						.build() )
				.homeTeam( Team.builder()
						.id( 9 )
						.name( Name.builder()
								.name( "Senators" )
								.fr( "Sénateurs")
								.build() )
						.abbrev( "OTT" )
						.score( 4 )
						.sog( 30 )
						.logo( "https://assets.nhle.com/logos/nhl/svg/OTT_light.svg" )
						.build() )
				.gameCenterLink( "/gamecenter/cgy-vs-ott/2024/11/25/2024020340" )
				.threeMinRecap( "/video/cgy-at-ott-recap-6365192047112" )
				.threeMinRecapFr( "/fr/video/cgy-vs-ott-25-11-2024-resume-6365192348112" )
				.condensedGame( "/video/cgy-at-ott-condensed-game-6365192927112" )
				.condensedGameFr( "/fr/video/match-condense-flames-senateurs25-11-2024-6365191957112" )
				.neutralSite( false )
				.venueTimezone( "US/Eastern" )
				.period( 3 )
				.build();

		assertEquals( (Integer) 2024020340, game.getId() );
		assertEquals( (Integer) 20242025, game.getSeason() );
		assertEquals( (Integer) 2, game.getGameType() );
		assertEquals( LocalDate.parse( "2024-11-25" ), game.getGameDate() );
		assertEquals( "Kanata, ON", game.getVenue().getName() );
		assertEquals( LocalDateTime.parse( "2024-11-25T16:30:00" ), game.getStartTime() );
		assertEquals( "-05:00", game.getEasternUTCOffset() );
		assertEquals( "-05:00", game.getVenueUTCOffset() );
		assertEquals( 1, game.getTvBroadcasts().size() );
		assertEquals( "OFF", game.getGameState() );
		assertEquals( "OK", game.getGameScheduleState() );
		assertEquals( "/gamecenter/cgy-vs-ott/2024/11/25/2024020340", game.getGameCenterLink() );
		assertEquals( "/video/cgy-at-ott-recap-6365192047112", game.getThreeMinRecap() );
		assertEquals( "/fr/video/cgy-vs-ott-25-11-2024-resume-6365192348112", game.getThreeMinRecapFr() );
		assertEquals( "/video/cgy-at-ott-condensed-game-6365192927112", game.getCondensedGame() );
		assertEquals( "/fr/video/match-condense-flames-senateurs25-11-2024-6365191957112", game.getCondensedGameFr() );
		assertFalse( game.isNeutralSite() );
		assertEquals( "US/Eastern", game.getVenueTimezone() );
		assertEquals( (Integer) 3, game.getPeriod() );
	}


	@Test
	public void testGameJson() {
		String json = "{\"id\":2024020340,\"season\":20242025,\"gameType\":2,\"gameDate\":\"2024-11-25\",\"venue\":{\"default\":\"Canadian Tire Centre\"},\"startTimeUTC\":\"2024-11-26T00:30:00Z\",\"easternUTCOffset\":\"-05:00\",\"venueUTCOffset\":\"-05:00\",\"tvBroadcasts\":[{\"id\":548,\"market\":\"N\",\"countryCode\":\"CA\",\"network\":\"Prime\",\"sequenceNumber\":105}],\"gameState\":\"OFF\",\"gameScheduleState\":\"OK\",\"awayTeam\":{\"id\":20,\"name\":{\"default\":\"Flames\"},\"abbrev\":\"CGY\",\"score\":3,\"sog\":27,\"logo\":\"https://assets.nhle.com/logos/nhl/svg/CGY_light.svg\"},\"homeTeam\":{\"id\":9,\"name\":{\"default\":\"Senators\",\"fr\":\"Sénateurs\"},\"abbrev\":\"OTT\",\"score\":4,\"sog\":30,\"logo\":\"https://assets.nhle.com/logos/nhl/svg/OTT_light.svg\"},\"gameCenterLink\":\"/gamecenter/cgy-vs-ott/2024/11/25/2024020340\",\"threeMinRecap\":\"/video/cgy-at-ott-recap-6365192047112\",\"threeMinRecapFr\":\"/fr/video/cgy-vs-ott-25-11-2024-resume-6365192348112\",\"condensedGame\":\"/video/cgy-at-ott-condensed-game-6365192927112\",\"condensedGameFr\":\"/fr/video/match-condense-flames-senateurs25-11-2024-6365191957112\",\"clock\":{\"timeRemaining\":\"00:00\",\"secondsRemaining\":0,\"running\":false,\"inIntermission\":false},\"neutralSite\":false,\"venueTimezone\":\"US/Eastern\",\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"gameOutcome\":{\"lastPeriodType\":\"REG\"},\"goals\":[{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"14:32\",\"playerId\":8476456,\"name\":{\"default\":\"J. Huberdeau\"},\"firstName\":{\"default\":\"Jonathan\"},\"lastName\":{\"default\":\"Huberdeau\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8482679,\"name\":{\"default\":\"M. Coronato\"},\"assistsToDate\":4},{\"playerId\":8482074,\"name\":{\"default\":\"C. Zary\"},\"assistsToDate\":7}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/CGY/8476456.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":7,\"awayScore\":1,\"homeScore\":0,\"strength\":\"pp\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-huberdeau-scores-ppg-against-anton-forsberg-6365186970112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-huberdeau-marque-un-but-en-a-n-contre-anton-forsberg-6365186486112\",\"highlightClip\":6365186970112,\"highlightClipFr\":6365186486112,\"discreteClip\":6365186112112,\"discreteClipFr\":6365187257112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"17:05\",\"playerId\":8478874,\"name\":{\"default\":\"A. Gaudette\"},\"firstName\":{\"default\":\"Adam\"},\"lastName\":{\"default\":\"Gaudette\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8482092,\"name\":{\"default\":\"R. Greig\"},\"assistsToDate\":4},{\"playerId\":8473512,\"name\":{\"default\":\"C. Giroux\"},\"assistsToDate\":10}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/OTT/8478874.png\",\"teamAbbrev\":\"OTT\",\"goalsToDate\":9,\"awayScore\":1,\"homeScore\":1,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-gaudette-scores-goal-against-dustin-wolf-6365185823112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-gaudette-marque-un-but-contre-dustin-wolf-6365185636112\",\"highlightClip\":6365185823112,\"highlightClipFr\":6365185636112,\"discreteClip\":6365187279112,\"discreteClipFr\":6365186603112},{\"period\":2,\"periodDescriptor\":{\"number\":2,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"03:18\",\"playerId\":8480208,\"name\":{\"default\":\"D. Batherson\"},\"firstName\":{\"default\":\"Drake\"},\"lastName\":{\"default\":\"Batherson\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8480801,\"name\":{\"default\":\"B. Tkachuk\"},\"assistsToDate\":12},{\"playerId\":8482105,\"name\":{\"default\":\"J. Sanderson\"},\"assistsToDate\":12}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/OTT/8480208.png\",\"teamAbbrev\":\"OTT\",\"goalsToDate\":9,\"awayScore\":1,\"homeScore\":2,\"strength\":\"pp\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-batherson-scores-ppg-against-dustin-wolf-6365188328112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-batherson-marque-un-but-en-a-n-contre-dustin-wolf-6365188799112\",\"highlightClip\":6365188328112,\"highlightClipFr\":6365188799112,\"discreteClip\":6365188210112,\"discreteClipFr\":6365188894112},{\"period\":2,\"periodDescriptor\":{\"number\":2,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"13:17\",\"playerId\":8481133,\"name\":{\"default\":\"C. Reinhardt\"},\"firstName\":{\"default\":\"Cole\"},\"lastName\":{\"default\":\"Reinhardt\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8482092,\"name\":{\"default\":\"R. Greig\"},\"assistsToDate\":5},{\"playerId\":8482105,\"name\":{\"default\":\"J. Sanderson\"},\"assistsToDate\":13}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/OTT/8481133.png\",\"teamAbbrev\":\"OTT\",\"goalsToDate\":1,\"awayScore\":1,\"homeScore\":3,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-reinhardt-scores-goal-against-dustin-wolf-6365189509112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-reinhardt-marque-un-but-contre-dustin-wolf-6365188158112\",\"highlightClip\":6365189509112,\"highlightClipFr\":6365188158112,\"discreteClip\":6365189883112,\"discreteClipFr\":6365188060112},{\"period\":2,\"periodDescriptor\":{\"number\":2,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"15:27\",\"playerId\":8481068,\"name\":{\"default\":\"Y. Sharangovich\",\"cs\":\"J. Šarangovič\",\"sk\":\"J. Šarangovič\"},\"firstName\":{\"default\":\"Yegor\",\"cs\":\"Jegor\",\"sk\":\"Jegor\"},\"lastName\":{\"default\":\"Sharangovich\",\"cs\":\"Šarangovič\",\"sk\":\"Šarangovič\"},\"goalModifier\":\"none\",\"assists\":[],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/CGY/8481068.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":5,\"awayScore\":2,\"homeScore\":3,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-sharangovich-scores-goal-against-anton-forsberg-6365190489112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-sharangovich-marque-un-but-contre-anton-forsberg-6365189337112\",\"highlightClip\":6365190489112,\"highlightClipFr\":6365189337112,\"discreteClip\":6365188653112,\"discreteClipFr\":6365189711112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"01:14\",\"playerId\":8480801,\"name\":{\"default\":\"B. Tkachuk\"},\"firstName\":{\"default\":\"Brady\"},\"lastName\":{\"default\":\"Tkachuk\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8480208,\"name\":{\"default\":\"D. Batherson\"},\"assistsToDate\":13},{\"playerId\":8482116,\"name\":{\"default\":\"T. Stützle\"},\"assistsToDate\":16}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/OTT/8480801.png\",\"teamAbbrev\":\"OTT\",\"goalsToDate\":11,\"awayScore\":2,\"homeScore\":4,\"strength\":\"pp\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-tkachuk-scores-ppg-against-dustin-wolf-6365190069112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-tkachuk-marque-un-but-en-a-n-contre-dustin-wolf-6365191351112\",\"highlightClip\":6365190069112,\"highlightClipFr\":6365191351112,\"discreteClip\":6365190156112,\"discreteClipFr\":6365191034112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\",\"maxRegulationPeriods\":3},\"timeInPeriod\":\"19:21\",\"playerId\":8474150,\"name\":{\"default\":\"M. Backlund\"},\"firstName\":{\"default\":\"Mikael\"},\"lastName\":{\"default\":\"Backlund\"},\"goalModifier\":\"none\",\"assists\":[{\"playerId\":8483808,\"name\":{\"default\":\"A. Kuzmenko\"},\"assistsToDate\":9},{\"playerId\":8475172,\"name\":{\"default\":\"N. Kadri\"},\"assistsToDate\":7}],\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20242025/CGY/8474150.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":5,\"awayScore\":3,\"homeScore\":4,\"strength\":\"ev\",\"highlightClipSharingUrl\":\"https://nhl.com/video/cgy-ott-backlund-scores-goal-against-anton-forsberg-6365191569112\",\"highlightClipSharingUrlFr\":\"https://nhl.com/fr/video/cgy-ott-backlund-marque-un-but-contre-anton-forsberg-6365193417112\",\"highlightClip\":6365191569112,\"highlightClipFr\":6365193417112,\"discreteClip\":6365192545112,\"discreteClipFr\":6365191566112}]}";
		Game game = JsonHelper.jsonToObject( json, Game.class);

		assertEquals( (Integer) 2024020340, game.getId() );
		assertEquals( (Integer) 20242025, game.getSeason() );
		assertEquals( (Integer) 2, game.getGameType() );
		assertEquals( LocalDate.parse( "2024-11-25" ), game.getGameDate() );
		assertEquals( LocalDateTime.parse( "2024-11-25T16:30:00" ), game.getStartTime() );
		assertEquals( 7, game.getGoals().size() );

		String string = JsonHelper.objectToJson( game );
		assertEquals( json.length(), string.length() );
	}
}
