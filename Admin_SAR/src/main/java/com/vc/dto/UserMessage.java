package com.vc.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserMessage
{
	private int id;
	private String userMessage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	@Override
	public String toString() {
		return "UserMessage [id=" + id + ", userMessage=" + userMessage + "]";
	}

}
