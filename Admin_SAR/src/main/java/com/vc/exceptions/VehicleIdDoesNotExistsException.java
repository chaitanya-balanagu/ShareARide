package com.vc.exceptions;


public class VehicleIdDoesNotExistsException extends  RuntimeException
{
	private String msg;
	public VehicleIdDoesNotExistsException(String msg) 
	{
	super(msg);
	this.msg=msg;
	}
}

