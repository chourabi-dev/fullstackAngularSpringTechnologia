package com.example.technologia.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name = "employees" )
@JsonIgnoreProperties( {"hibernateLazyInitializer","handler","department"} )
public class Employee {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	 
	@Column( name ="first_name", nullable = false )
	private String firstname;
	
	@Column( name ="last_name", nullable = false )
	private String lastname;
	
	
	@ManyToOne
	@JoinColumn( name="departments_id" )
	private Department department;
	
	
	
	@OneToOne
	@JoinColumn( name="phones_id" )
	private PhoneNumber phone;
	
	
	
	
	
	

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Employee() {
		super();
	}
	
	
	
	
	
}
