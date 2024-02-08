package com.vc.exceptions;

public class VehicleAlreadyExistsException extends  RuntimeException
{
	private String msg;
	public VehicleAlreadyExistsException(String msg)
	{
	super(msg);
	this.msg=msg;
	}
}


