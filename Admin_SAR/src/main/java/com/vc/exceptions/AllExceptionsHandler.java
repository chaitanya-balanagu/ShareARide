package com.vc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AllExceptionsHandler
{
	@ExceptionHandler(value=VehicleAlreadyExistsException.class)
	@ResponseBody
	public ErrorResponse handleCourseAlreadyExist(VehicleAlreadyExistsException ex)

	{
		ErrorResponse er=new ErrorResponse();

		er.setStatusCode(HttpStatus.CONFLICT.value());
		er.setMessage(ex.getMessage());
		return er;
	}

	@ExceptionHandler(value=VehicleIdDoesNotExistsException.class)
	@ResponseBody
	public ErrorResponse handleCourseDoesNotExist(VehicleIdDoesNotExistsException ex)

	{
		ErrorResponse er=new ErrorResponse();
		er.setStatusCode(HttpStatus.CONFLICT.value());
		er.setMessage(ex.getMessage());
		return er;
	}
}


