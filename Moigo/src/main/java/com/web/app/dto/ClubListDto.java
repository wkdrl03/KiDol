package com.web.app.dto;

import java.util.Date;

public class ClubListDto {

	private String clubName;
	private int memberNum;
	private String presidentName;
	private Date cubDate;
	private String presidentEmail;
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}
	public Date getCubDate() {
		return cubDate;
	}
	public void setCubDate(Date cubDate) {
		this.cubDate = cubDate;
	}
	public String getPresidentEmail() {
		return presidentEmail;
	}
	public void setPresidentEmail(String presidentEmail) {
		this.presidentEmail = presidentEmail;
	}
	
	
}
