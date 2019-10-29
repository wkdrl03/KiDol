package com.web.app.dto;

import java.util.Date;

public class ClubJoinDto {
	
	private Date writeDate;
	private String selfAbout;
	private String clubName;
	private String email;
	
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getSelfAbout() {
		return selfAbout;
	}
	public void setSelfAbout(String selfAbout) {
		this.selfAbout = selfAbout;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
