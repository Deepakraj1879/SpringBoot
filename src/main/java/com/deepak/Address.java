package com.deepak;



import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private Integer addressId;
	
	@Column(name="STREET",length=50)
	private String sreeet;
	
	@Column(name="CITY", length=100)
	private String city;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient // it will create this column in database
	private Double d;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
	}
	public Address(Integer addressId, String sreeet, String city, boolean isOpen, Double d, Date addedDate,
			byte[] image) {
		super();
		this.addressId = addressId;
		this.sreeet = sreeet;
		this.city = city;
		this.isOpen = isOpen;
		this.d = d;
		this.addedDate = addedDate;
		this.image = image;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getSreeet() {
		return sreeet;
	}
	public void setSreeet(String sreeet) {
		this.sreeet = sreeet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Double getD() {
		return d;
	}
	public void setD(Double d) {
		this.d = d;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", sreeet=" + sreeet + ", city=" + city + ", isOpen=" + isOpen
				+ ", d=" + d + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
