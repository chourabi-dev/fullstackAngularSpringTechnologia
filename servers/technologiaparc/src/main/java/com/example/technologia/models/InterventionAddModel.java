package com.example.technologia.models;

import java.time.LocalDate;
import java.util.Date;

public class InterventionAddModel {

 
	private String description; 
	private double amount;  
	private long id_vehicule;
	private LocalDate date_user;
	
	
	
	
	public LocalDate getDate_user() {
		return date_user;
	}
	public void setDate_user(LocalDate date_user) {
		this.date_user = date_user;
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
	public long getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(long id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	
	
}
