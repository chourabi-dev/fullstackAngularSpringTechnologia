package com.example.technologia.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Department;
import com.example.technologia.entities.Employee;
import com.example.technologia.entities.JobStarter;
import com.example.technologia.repositories.JobsRepository;
import com.example.technologia.service.EmployeeService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	
	
	@Autowired
	private JobsRepository jr;
	
	
	@Autowired
	private EmployeeService es;
	
	
	@GetMapping("/add")
    public void addEntrance() {
		JobStarter j = new JobStarter();
		 
		
		Employee e = this.es.getEmployeeRepository().findById(Long.valueOf(11)).get();
		Department d = this.es.getDepartmentRepository().findById(Long.valueOf(1)).get();
		
		
		
		j.setEmployee(e);
		j.setDepartment(d);
		
		LocalDateTime date = LocalDateTime.now();
		
		j.setDate(date);
		
		this.jr.save(j);
	}
}
