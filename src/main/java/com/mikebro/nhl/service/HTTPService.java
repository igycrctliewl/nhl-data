package com.mikebro.nhl.service;

import org.springframework.stereotype.Service;

@Service
public interface HTTPService {

	/**
	 * A simple HTTP service to get the content from a resource identified by a URL.
	 * @param urlToRead
	 * @return String containing content from web
	 */
	public String getHTML(String urlToRead);

}
