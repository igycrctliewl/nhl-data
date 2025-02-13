package com.mikebro.nhl.service;

import org.springframework.stereotype.Service;

@Service
public interface TeamNamesService {

	/**
	 * Get the full team name
	 * @param triCode A three-character code to translate
	 * @return the full team name matching the three-character triCode
	 */
	public String getFullName( String triCode );

	/**
	 * Get the common team place name
	 * @param triCode A three-character code to translate
	 * @return the team place name matching the three-character triCode
	 */
	public String getPlaceName( String triCode );

	/**
	 * Get the common team nickname
	 * @param triCode A three-character code to translate
	 * @return the team nickname matching the three-character triCode
	 */
	public String getNickName( String triCode );

}
