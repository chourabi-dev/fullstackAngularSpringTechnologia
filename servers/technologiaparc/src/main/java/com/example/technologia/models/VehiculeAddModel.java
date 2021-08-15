package com.example.technologia.models;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.technologia.entities.Client;

public class VehiculeAddModel {

 
	private String ps;
	
 
	private String matricule;
	 
	private long client_id;
	private long model_id;
	
	
	

	public long getModel_id() {
		return model_id;
	}

	public void setModel_id(long model_id) {
		this.model_id = model_id;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}
	
	
}
