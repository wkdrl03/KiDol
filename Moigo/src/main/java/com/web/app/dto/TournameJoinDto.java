package com.web.app.dto;

import java.util.Date;

public class TournameJoinDto {

	private int joinpersonnumber;
	private Date writedate;
	private int boardnumber;
	private String clubName;
	public int getJoinpersonnumber() {
		return joinpersonnumber;
	}
	public void setJoinpersonnumber(int joinpersonnumber) {
		this.joinpersonnumber = joinpersonnumber;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	
	
}
