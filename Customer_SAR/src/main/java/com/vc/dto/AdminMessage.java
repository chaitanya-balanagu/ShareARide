package com.vc.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//model class of the admin message

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminMessage
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String adminMessage;

}





