package com.vc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Message_Table")
public class UserMessage
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userMessage;
}
