package com.web.app.dto;

import java.util.Date;

public class MessagesDto {
	
	private int messageNum;		
	private  Date writeDate;
	private  String title;	
	private String content;		
	private String classification;		
	private String toemail;			
	private String fromEmail;
	
	
	public int getMessageNum() {
		return messageNum;
	}
	public void setMessageNum(int messageNum) {
		this.messageNum = messageNum;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getToemail() {
		return toemail;
	}
	public void setToemail(String toemail) {
		this.toemail = toemail;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	
	
}
