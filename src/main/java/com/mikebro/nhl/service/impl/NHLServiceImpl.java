package com.mikebro.nhl.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikebro.jsonhelper.JsonHelper;
import com.mikebro.nhl.json.Schedule;
import com.mikebro.nhl.service.HTTPService;
import com.mikebro.nhl.service.NHLService;

/**
 * Services to get the NHL Schedule object
 * @author mikebro
 *
 */
@Service
public class NHLServiceImpl implements NHLService {

	private static final String BASE_URL = "https://api-web.nhle.com/v1/score/";

	@Autowired
	HTTPService httpService;


	@Override
	public Schedule getSchedule(LocalDate effdt) {
		String urlString = BASE_URL.concat( effdt.toString() );
		return parseJson( httpService.getHTML( urlString ) );
	}

	@Override
	public Schedule getTodaySchedule() {
		return getSchedule( LocalDate.now() );
	}


	private Schedule parseJson( String json ) {
		return JsonHelper.jsonToObject( json, Schedule.class);
	}
}
