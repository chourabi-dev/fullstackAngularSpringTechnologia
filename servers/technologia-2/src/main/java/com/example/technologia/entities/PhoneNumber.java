package com.example.technologia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "phones" )
public class PhoneNumber {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	 
	@Column( name ="phone", nullable = false )
	private String phone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PhoneNumber() {
		super();
	}
	
	
}
