package com.mikebro.nhl.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.mikebro.nhl.service.impl.HTTPServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class HTTPServiceTest {

	@InjectMocks
	HTTPService httpService = new HTTPServiceImpl();


	@Test
	public void testHTTPService() {
		String urlString = "https://api-web.nhle.com/v1/score/2024-12-14";
		String response = httpService.getHTML( urlString );
		assertNotNull( response );
		assertTrue( response.length() > 0 );
	}
}
