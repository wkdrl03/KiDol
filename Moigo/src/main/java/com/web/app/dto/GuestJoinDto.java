package com.web.app.dto;

public class GuestJoinDto {

	private String applicant;		
	private int attendPerson;
	private int boardNumber;
	private String clubName;
	private int messageNum;
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public int getAttendPerson() {
		return attendPerson;
	}
	public void setAttendPerson(int attendPerson) {
		this.attendPerson = attendPerson;
	}
	public int getBoardNumber() {
		return boardNumber;
	}
	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public int getMessageNum() {
		return messageNum;
	}
	public void setMessageNum(int messageNum) {
		this.messageNum = messageNum;
	}
	
}
