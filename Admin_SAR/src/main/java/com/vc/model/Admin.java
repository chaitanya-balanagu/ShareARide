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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Register_Table")
public class Admin
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(nullable=false)
	private String userName;

	@Column(nullable=false)
	private String password;

	@Column(nullable=false)
	private String name;

	@Column(nullable=false)
	private String email;

	@Column(nullable=false)
	private String contact;

	@Column(nullable=false)
	private String usertype;

}
