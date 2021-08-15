package com.example.technologia.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "jobs" )
public class JobStarter {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	
	
	@ManyToOne
	@JoinColumn( name="departments_id" )
	private Department department;
	
	
	@ManyToOne
	@JoinColumn( name="employees_id" )
	private Employee employee;
	
	
	private LocalDateTime date;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public JobStarter() {
		super();
	}
	
	
	
	
	
	

}
