package com.sig.model;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Publication {

	private int publi_id, user_id;
	private String publi_description;
	private Date publi_date;
	public int getPubli_id() {
		return publi_id;
	}
	public void setPubli_id(int publi_id) {
		this.publi_id = publi_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPubli_description() {
		return publi_description;
	}
	public void setPubli_description(String publi_description) {
		this.publi_description = publi_description;
	}
	public Date getPubli_date() {
		return publi_date;
	}
	public void setPubli_date(Date publi_date) {
		this.publi_date = publi_date;
	}
		
	
}
