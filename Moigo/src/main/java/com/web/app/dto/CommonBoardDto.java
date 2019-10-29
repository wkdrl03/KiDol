package com.web.app.dto;

import java.util.Date;

public class CommonBoardDto {

	private int boardnumber;
	private String title;
	private String writename;
	private Date writedate;
	private String content;
	private String boardCategory;
	private String email;
	private String category;
	
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWritename() {
		return writename;
	}
	public void setWritename(String writename) {
		this.writename = writename;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
