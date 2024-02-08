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
@Table(name="vehicle_table")

//all the vehicles appears in this table
public class Vehicle
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(nullable=false)
	private String vehcname;

	@Column(nullable=false)
	private String vehmname;

	@Column(unique=true,nullable=false)
	private String vehnum;

	@Column(nullable=false)
	private int vehtype;

	@Column(nullable=false)
	private String bookingstatus;

	@Column(nullable=false)
	private int price;

	@Column(nullable=false)
	private int cancellationstatus;

}


