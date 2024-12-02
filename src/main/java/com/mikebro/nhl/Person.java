package com.mikebro.nhl;

import java.sql.Date;

/**
 * @deprecated I have no idea what I created this for.  Candidate for deletion
 * @author mikebro
 */
@Deprecated
public class Person {

	private Long id;
	private String emplid;
	private String fname;
	private String lname;
	private java.sql.Date bday;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getEmplid() {
		return emplid;
	}

	public void setEmplid( String emplid ) {
		this.emplid = emplid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname( String fname ) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname( String lname ) {
		this.lname = lname;
	}

	public Date getBday() {
		return bday;
	}

	public void setBday( Date bday ) {
		this.bday = bday;
	}

}
