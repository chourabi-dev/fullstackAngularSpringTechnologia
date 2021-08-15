package com.example.technologia.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name = "interventions" )
@JsonIgnoreProperties( {"hibernateLazyInitializer","handler","vehicule"} )
public class Intervention {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	 
	@Column( name ="description", nullable = false )
	private String description;
	
	@Column( name ="amount", nullable = false )
	private double amount;
	
	@Column( name ="date", nullable = false )
	private LocalDateTime date =  LocalDateTime .now();
	
	@Column( name ="date_user", nullable = false )
	private LocalDate date_user;
	
	
	
	
	public LocalDate getDate_user() {
		return date_user;
	}

	public void setDate_user(LocalDate date_user) {
		this.date_user = date_user;
	}

	@ManyToOne
	@JoinColumn( name="vehicules_id" )
	private Vehicule vehicule;
	
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Intervention(long id, String description, double amount, LocalDateTime date, Vehicule vehicule) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.date = date;
		this.vehicule = vehicule;
	}

	public Intervention() {
		super();
	}
	
	
	
	
	
	 
	
	
	

}
