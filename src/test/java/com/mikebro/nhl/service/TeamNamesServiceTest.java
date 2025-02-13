package com.mikebro.nhl.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.mikebro.nhl.service.impl.TeamNamesServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TeamNamesServiceTest {

	@InjectMocks
	TeamNamesServiceImpl teamNamesService;


	@Test
	public void testGetFullName() {
		String triCode = "CGY";
		String fullName = teamNamesService.getFullName( triCode );
		assertNotNull( fullName );
		assertEquals( "Calgary Flames", fullName );
	}

	@Test
	public void testGetPlaceName() {
		String triCode = "CBJ";
		String placeName = teamNamesService.getPlaceName( triCode );
		assertNotNull( placeName );
		assertEquals( "Columbus", placeName );
	}

	@Test
	public void testGetNickName() {
		String triCode = "NYR";
		String nickName = teamNamesService.getNickName( triCode );
		assertNotNull( nickName );
		assertEquals( "Rangers", nickName );
	}


}
