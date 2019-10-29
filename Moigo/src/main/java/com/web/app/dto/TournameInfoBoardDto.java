package com.web.app.dto;

import java.util.Date;

public class TournameInfoBoardDto {

	
	private int boardnumber;
	private Date tournameStartDate;
	private Date tournameEndDate;
	private String tournameName;
	private String location;
	private int joinPersonNumber;
	private String Picture;
	private String fullPersonCheck;
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public Date getTournameStartDate() {
		return tournameStartDate;
	}
	public void setTournameStartDate(Date tournameStartDate) {
		this.tournameStartDate = tournameStartDate;
	}
	public Date getTournameEndDate() {
		return tournameEndDate;
	}
	public void setTournameEndDate(Date tournameEndDate) {
		this.tournameEndDate = tournameEndDate;
	}
	public String getTournameName() {
		return tournameName;
	}
	public void setTournameName(String tournameName) {
		this.tournameName = tournameName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getJoinPersonNumber() {
		return joinPersonNumber;
	}
	public void setJoinPersonNumber(int joinPersonNumber) {
		this.joinPersonNumber = joinPersonNumber;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public String getFullPersonCheck() {
		return fullPersonCheck;
	}
	public void setFullPersonCheck(String fullPersonCheck) {
		this.fullPersonCheck = fullPersonCheck;
	}
	
	
}
