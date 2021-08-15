package com.example.technologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Department;
import com.example.technologia.repositories.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	@GetMapping("/list")
	public List<Department> getAllDepartments(){
		return this.departmentRepository.findAll();
	}

}
