package com.vc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Vehicles_List")
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
	private String cancellationstatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehcname() {
		return vehcname;
	}

	public void setVehcname(String vehcname) {
		this.vehcname = vehcname;
	}

	public String getVehmname() {
		return vehmname;
	}

	public void setVehmname(String vehmname) {
		this.vehmname = vehmname;
	}

	public String getVehnum() {
		return vehnum;
	}

	public void setVehnum(String vehnum) {
		this.vehnum = vehnum;
	}

	public int getVehtype() {
		return vehtype;
	}

	public void setVehtype(int vehtype) {
		this.vehtype = vehtype;
	}

	public String getBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCancellationstatus() {
		return cancellationstatus;
	}

	public void setCancellationstatus(String cancellationstatus) {
		this.cancellationstatus = cancellationstatus;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehcname=" + vehcname + ", vehmname=" + vehmname + ", vehnum=" + vehnum
				+ ", vehtype=" + vehtype + ", bookingstatus=" + bookingstatus + ", price=" + price
				+ ", cancellationstatus=" + cancellationstatus + "]";
	}
}



