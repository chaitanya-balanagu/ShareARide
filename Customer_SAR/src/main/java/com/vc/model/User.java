package com.vc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_table")

//users table where logged in persons appears
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(nullable=false)
	private String userName;

	@Column(nullable=false)
	private String password;

}