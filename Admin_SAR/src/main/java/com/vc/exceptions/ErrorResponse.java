package com.vc.exceptions;

public class ErrorResponse 
{
	private int statusCode;
	private String message;
	public int getStatusCode()
	{
	return statusCode;
	}
	public void setStatusCode(int i)
	{
	this.statusCode = i;
	}
	public String getMessage() 
	{
	return message;
	}
	public void setMessage(String message) 
	{
	this.message = message;
	}
	public ErrorResponse(int statusCode, String message) 
	{
	super();
	this.statusCode = statusCode;
	this.message = message;
	}
	public ErrorResponse() 
	{
	}
}
