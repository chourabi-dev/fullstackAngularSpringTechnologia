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
@Table( name = "departments" )
public class Department {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	 
	@Column( name ="name", nullable = false )
	private String name;
	
	@OneToMany( mappedBy="department", fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	
	private List<Employee> employees;
	
	
	

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Department() {
		super();
	}
	
	
}
