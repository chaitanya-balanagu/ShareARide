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
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_Bookings")
public class UserRide
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getVehnum() {
		return vehnum;
	}

	public void setVehnum(String vehnum) {
		this.vehnum = vehnum;
	}

	public String getVehmname() {
		return vehmname;
	}

	public void setVehmname(String vehmname) {
		this.vehmname = vehmname;
	}

	@Override
	public String toString() {
		return "UserRide [id=" + id + ", source=" + source + ", destination=" + destination + ", date=" + date
				+ ", time=" + time + ", vehnum=" + vehnum + ", vehmname=" + vehmname + "]";
	}
}



