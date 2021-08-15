package com.example.technologia.entities;

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
@Table( name = "vehicules" )
@JsonIgnoreProperties( {"hibernateLazyInitializer","handler","client"} )
public class Vehicule {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	@Column( name ="ps", nullable = false )
	private String ps;
	
	@Column( name ="matricule", nullable = false )
	private String matricule;
	
	@ManyToOne
	@JoinColumn( name="clients_id" )
	private Client client;
	
	@ManyToOne
	@JoinColumn( name="models_id" )
	private Model model;
	
	
	@OneToMany( mappedBy="vehicule", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private List<Intervention> interventions;
	
	
	

	public List<Intervention> getInterventions() {
		return interventions;
	}

	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Vehicule(long id, String ps, String matricule, Client client) {
		super();
		this.id = id;
		this.ps = ps;
		this.matricule = matricule;
		this.client = client;
	}

	public Vehicule() {
		super();
	}
	
	
	
	
	
	
	
}
