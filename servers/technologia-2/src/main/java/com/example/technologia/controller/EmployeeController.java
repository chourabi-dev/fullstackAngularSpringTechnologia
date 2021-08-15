package com.example.technologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Department;
import com.example.technologia.entities.Employee;
import com.example.technologia.model.AddProductModel;
import com.example.technologia.model.EmployeeModel;
import com.example.technologia.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> getEmployees(){
		return  this.employeeService.getEmployeeRepository().findAll();
		
	}
	
	
	@PostMapping("/add")
	public void addNewEmployee(@RequestBody() EmployeeModel em ) {
		try {
			Employee e = new Employee();
			
			e.setFirstname(em.getFirstname());
			e.setLastname(em.getLastname());
			
			Department d;
			
			d = this.employeeService.getDepartmentRepository().findById(em.getId_department()).get();
			
			
			e.setDepartment( d );
			
			this.employeeService.getEmployeeRepository().save(e);
			
		}catch(Exception er) {
			System.out.print(er.getMessage());
		}
		
	}

}
