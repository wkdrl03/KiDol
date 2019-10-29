package com.web.app.dto;

public class JoinTeamDto {
	
	private int joinPersonNumber;
	private int boardnumber;
	private String email;
	private String clubName;
	
	public int getJoinPersonNumber() {
		return joinPersonNumber;
	}
	public void setJoinPersonNumber(int joinPersonNumber) {
		this.joinPersonNumber = joinPersonNumber;
	}
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	
}
