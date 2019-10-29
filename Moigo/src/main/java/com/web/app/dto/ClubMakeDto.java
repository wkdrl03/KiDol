package com.web.app.dto;

import java.util.Date;

public class ClubMakeDto {

	private String clubName;
	private String category;
	private String detailedPlan;
	private String writer;
	private Date writeDat;
	private String area;
	private String email;
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDetailedPlan() {
		return detailedPlan;
	}
	public void setDetailedPlan(String detailedPlan) {
		this.detailedPlan = detailedPlan;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWriteDat() {
		return writeDat;
	}
	public void setWriteDat(Date writeDat) {
		this.writeDat = writeDat;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
