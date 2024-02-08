package com.vc.model;

import java.time.LocalTime;
import java.util.Date;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Admin_Bookings")
public class Ride
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(nullable=false)
	private String source;

	@Column(nullable=false)
	private String destination;

	@Column(nullable=false)
	private Date date;

	@Column(nullable=false)
	private LocalTime time;

	@Column(nullable=false)
	private String vehnum;

	@Column(nullable=false)
	private String vehmname;

}
