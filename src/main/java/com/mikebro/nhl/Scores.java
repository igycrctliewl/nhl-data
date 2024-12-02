package com.mikebro.nhl;

import com.mikebro.jsonhelper.JsonHelper;
import com.mikebro.nhl.json.Broadcasters;
import com.mikebro.nhl.json.Building;
import com.mikebro.nhl.json.GameOutcome;
import com.mikebro.nhl.json.Goals;
import com.mikebro.nhl.json.HomeTeam;
import com.mikebro.nhl.json.PeriodDescriptor;
import com.mikebro.nhl.json.WaysToLoseYourMoney;


public class Scores {

	public static void main( String[] args ) {

		String gamblerJson = "{\"oddsPartners\":[{\"partnerId\":2,\"country\":\"SE\",\"name\":\"Unibet\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/unibet.svg\",\"siteUrl\":\"https://www.unibet.se/betting/sports/filter/ice_hockey/nhl/all/matches\",\"bgColor\":\"#14805E\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#3AAA35\"},{\"partnerId\":3,\"country\":\"CZ\",\"name\":\"Tipsport\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/tipsport.svg\",\"siteUrl\":\"https://www.tipsport.cz/PartnerRedirectAction.do?pid=16961&sid=20360&bid=34954&tid=11268\",\"bgColor\":\"#2497F2\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFFFFF\"},{\"partnerId\":3,\"country\":\"SK\",\"name\":\"Tipsport\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/tipsport.svg\",\"siteUrl\":\"https://www.tipsport.sk/PartnerRedirectAction.do?pid=6823&sid=9018&bid=23079&tid=8475\",\"bgColor\":\"#2497F2\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFFFFF\"},{\"partnerId\":5,\"country\":\"RU\",\"name\":\"Liga Stavok\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/ligastavok.svg\",\"bgColor\":\"#007354\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFEB00\"},{\"partnerId\":6,\"country\":\"FI\",\"name\":\"Veikkaus\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/veikkaus.svg\",\"siteUrl\":\"https://www.veikkaus.fi/fi/vedonlyonti/pitkaveto?t=3-2-1_NHL\",\"bgColor\":\"#0025F5\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFFFFF\"},{\"partnerId\":7,\"country\":\"CA\",\"name\":\"FanDuel\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/fanduel.svg\",\"siteUrl\":\"https://fanduel.com\",\"bgColor\":\"#0078ff\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFFFFF\"},{\"partnerId\":8,\"country\":\"DE\",\"name\":\"Sportradar\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/sportsradar.svg\",\"siteUrl\":\"https://sportradar.com\",\"bgColor\":\"#000000\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#E6E6E6\"},{\"partnerId\":9,\"country\":\"US\",\"name\":\"DraftKings\",\"imageUrl\":\"https://assets.nhle.com/betting_partner/draftkings.svg\",\"siteUrl\":\"https://dksb.sng.link/As9kz/720m?_dl=https%3A%2F%2Fsportsbook.draftkings.com%2Fgateway%3Fs%3D158542143%26wpcid%3D331060%26wpsrc%3D1320%26wpcn%3DNHLSportsbook%26wpscn%3DOddsByDK%26wpcrn%3DStatic%26wpscid%3DEvergreen%26wpcrid%3Dxx&psn=NHL&pcid=331060&pcrn=Evergreen&pscn=OddsByDK\",\"bgColor\":\"#000000\",\"textColor\":\"#FFFFFF\",\"accentColor\":\"#FFFFFF\"}]}";
		WaysToLoseYourMoney degenerates = JsonHelper.jsonToObject(gamblerJson, WaysToLoseYourMoney.class);
		System.out.println( degenerates );

		String tvJson = "{\"tvBroadcasts\":[{\"id\":31,\"market\":\"A\",\"countryCode\":\"US\",\"network\":\"NESN\",\"sequenceNumber\":78},{\"id\":284,\"market\":\"N\",\"countryCode\":\"CA\",\"network\":\"SN1\",\"sequenceNumber\":23},{\"id\":289,\"market\":\"N\",\"countryCode\":\"CA\",\"network\":\"SNW\",\"sequenceNumber\":31}]}";
		Broadcasters tvPeople = JsonHelper.jsonToObject(tvJson, Broadcasters.class);
		System.out.println( tvPeople );

		String buildingJson = "{\"venue\":{\"default\":\"Scotiabank Saddledome\"}}";
		Building building = JsonHelper.jsonToObject(buildingJson, Building.class);
		System.out.println( building );

		String teamJson = "{\"homeTeam\":{\"id\":20,\"name\":{\"default\":\"Flames\"},\"abbrev\":\"CGY\",\"score\":3,\"sog\":29,\"logo\":\"https://assets.nhle.com/logos/nhl/svg/CGY_light.svg\"}}";
		HomeTeam homeTeam = JsonHelper.jsonToObject(teamJson, HomeTeam.class);
		System.out.println( homeTeam );


		String periodJson = "{\"periodDescriptor\":{\"number\":4,\"periodType\":\"OT\"}}";
		PeriodDescriptor period = JsonHelper.jsonToObject(periodJson, PeriodDescriptor.class);
		System.out.println( period );

		String outcomeJson = "{\"gameOutcome\":{\"lastPeriodType\":\"OT\",\"otPeriods\":1}}";
		GameOutcome outcome = JsonHelper.jsonToObject(outcomeJson, GameOutcome.class);
		System.out.println( outcome );

		String goalsJson = "{\"goals\":[{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\"},\"timeInPeriod\":\"12:55\",\"playerId\":8478430,\"name\":{\"default\":\"O. Kylington\"},\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20232024/CGY/8478430.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":2,\"awayScore\":0,\"homeScore\":1,\"strength\":\"EV\",\"highlightClip\":6347423808112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\"},\"timeInPeriod\":\"18:41\",\"playerId\":8475745,\"name\":{\"default\":\"C. Coyle\"},\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20232024/BOS/8475745.png\",\"teamAbbrev\":\"BOS\",\"goalsToDate\":19,\"awayScore\":1,\"homeScore\":1,\"strength\":\"EV\",\"highlightClip\":6347423646112},{\"period\":1,\"periodDescriptor\":{\"number\":1,\"periodType\":\"REG\"},\"timeInPeriod\":\"19:23\",\"playerId\":8481028,\"name\":{\"default\":\"M. Pospisil\",\"cs\":\"M. Pospíšil\",\"sk\":\"M. Pospíšil\"},\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20232024/CGY/8481028.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":5,\"awayScore\":1,\"homeScore\":2,\"strength\":\"EV\",\"highlightClip\":6347423652112},{\"period\":3,\"periodDescriptor\":{\"number\":3,\"periodType\":\"REG\"},\"timeInPeriod\":\"02:33\",\"playerId\":8475745,\"name\":{\"default\":\"C. Coyle\"},\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20232024/BOS/8475745.png\",\"teamAbbrev\":\"BOS\",\"goalsToDate\":20,\"awayScore\":2,\"homeScore\":2,\"strength\":\"EV\",\"highlightClip\":6347428036112},{\"period\":4,\"periodDescriptor\":{\"number\":4,\"periodType\":\"OT\"},\"timeInPeriod\":\"03:56\",\"playerId\":8475172,\"name\":{\"default\":\"N. Kadri\"},\"mugshot\":\"https://assets.nhle.com/mugs/nhl/20232024/CGY/8475172.png\",\"teamAbbrev\":\"CGY\",\"goalsToDate\":20,\"awayScore\":2,\"homeScore\":3,\"strength\":\"EV\",\"highlightClip\":6347429650112}]}";
		Goals goals = JsonHelper.jsonToObject(goalsJson, Goals.class);
		System.out.println( goals );
	}

}
