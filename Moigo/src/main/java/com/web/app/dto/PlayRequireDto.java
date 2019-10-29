package com.web.app.dto;

public class PlayRequireDto {

	private String gameDate;
	private String email;	
	private int attendNum;	
	private int boardNumber;
	private String clubName;
	private int messageNum;
	
	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAttendNum() {
		return attendNum;
	}
	public void setAttendNum(int attendNum) {
		this.attendNum = attendNum;
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
