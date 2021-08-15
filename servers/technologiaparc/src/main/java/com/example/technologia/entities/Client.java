package com.example.technologia.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "clients" )
public class Client {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	 
	@Column( name ="firstname", nullable = false )
	private String firstname;
	
	@Column( name ="lastname", nullable = false )
	private String lastname;
	
	@Column( name ="email", nullable = false )
	private String email;
	
	@Column( name ="cin", nullable = false )
	private String cin;
	
	
	@OneToMany( mappedBy="client", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private List<Vehicule> vehicules;
	
	
	
	

	public List<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicules = vehicules;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Client(long id, String firstname, String lastname, String email, String cin) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.cin = cin;
	}

	public Client() {
		super();
	}
	
	
	
	
	
	
	

}
