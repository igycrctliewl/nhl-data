package com.mikebro.nhl.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.mikebro.nhl.service.HTTPService;

/**
 * With thanks to https://stackoverflow.com/questions/1485708/how-do-i-do-a-http-get-in-java
 * @author mikebro
 *
 */
@Service
public class HTTPServiceImpl implements HTTPService {

	@Override
	public String getHTML(String urlToRead) {
		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlToRead);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()))) {
				for (String line; (line = reader.readLine()) != null; ) {
					result.append(line);
				}
				return result.toString();
			} catch( Exception e ) {
				System.err.println( "HTTP connect read failed");
				e.printStackTrace();
				return "";
			}
		} catch( Exception e ) {
			System.err.println( "URL/connect setup failed");
			e.printStackTrace();
			return "";
		}
	}

	public static void main(String[] args) throws Exception {
		HTTPServiceImpl http = new HTTPServiceImpl();
		String urlString = "https://api-web.nhle.com/v1/score/2024-12-14";
		String responseString = http.getHTML( urlString );
		System.out.println( responseString );
	}
}
