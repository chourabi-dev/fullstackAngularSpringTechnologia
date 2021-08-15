package com.example.technologia.model;

 

import com.example.technologia.entities.Department;

public class EmployeeModel {
 
	private String firstname;
	 
	private String lastname;
	 
	private long id_department;

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

	public long getId_department() {
		return id_department;
	}

	public void setId_department(long id_department) {
		this.id_department = id_department;
	}
	
	
}
