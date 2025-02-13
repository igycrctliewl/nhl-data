package com.mikebro.nhl.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mikebro.jsonhelper.JsonHelper;
import com.mikebro.nhl.service.TeamNamesService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Services to get the NHL Schedule object
 * @author mikebro
 *
 */
@Service
public class TeamNamesServiceImpl implements TeamNamesService {

	private static final Map<String,TeamName> NAMES_MAP = initializeMap();

	private static Map<String,TeamName> initializeMap() {
		TeamNames namesList = parseJson( readTeamNamesJson() );
		return namesList.getData().stream()
				.collect( Collectors.toMap( TeamName::getTriCode, Function.identity() ));
	}

	private static TeamNames parseJson( String json ) {
		return JsonHelper.jsonToObject( json, TeamNames.class);
	}

	private static String readTeamNamesJson() {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream( "allTeams.json" );
		InputStreamReader streamReader = new InputStreamReader( is, StandardCharsets.UTF_8 );
		BufferedReader reader = new BufferedReader( streamReader );

		String jsonString = "";
		try {
			for( String line; ( line = reader.readLine() ) != null; ) {
				jsonString = jsonString.concat( line );
			}
		} catch( IOException e ) {
			e.printStackTrace();
			jsonString = "error";
		}
		return jsonString;
	}


	@Override
	public String getFullName( String triCode ) {
		TeamName team = NAMES_MAP.get( triCode );
		return team == null ? "" : team.getFullName();
	}

	@Override
	public String getPlaceName( String triCode ) {
		TeamName team = NAMES_MAP.get( triCode );
		return team == null ? "" : team.getPlaceName();
	}

	@Override
	public String getNickName( String triCode ) {
		TeamName team = NAMES_MAP.get( triCode );
		return team == null ? "" : team.getNickName();
	}



	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	private static class TeamName {
		private String triCode;
		private String fullName;
		private String placeName;
		private String nickName;
	}

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	private static class TeamNames {
		private List<TeamName> data;
	}
}
