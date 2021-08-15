package com.example.technologia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.technologia.repositories.DepartmentRepository;
import com.example.technologia.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@Autowired
	private EmployeeRepository employeeRepository;


	public DepartmentRepository getDepartmentRepository() {
		return departmentRepository;
	}


	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	
	
	
}
