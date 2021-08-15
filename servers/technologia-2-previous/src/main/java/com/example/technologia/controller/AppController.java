package com.example.technologia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.model.AddProductModel;

@RestController
@RequestMapping("/app")

public class AppController {
  
	/*@GetMapping("/hello")
	public String sayHiToTheClient() {
		return "Hello client <3";
	}
	
	
	@GetMapping("/client")
	public String archive(@RequestParam( required = false ) String cin) {
		if(cin != null) {
			return "getting client N°: ".concat(cin);
		}
		
		return "welcome to client section";
	}
	
	
	@GetMapping("/calcul")
	public int calcul(@RequestParam() String x ,@RequestParam() String y ) {
		Integer xc = Integer.parseInt(x);
		Integer yc = Integer.parseInt(y);
		
		return (xc+yc);
	}
	
	
	@GetMapping("/employees")
	public List<String> employees(){
		List<String> emps = new ArrayList<String>();
		
		emps.add("taher");
		emps.add("nithar");
		emps.add("aymen");
		
		
		return emps;
	}
	
	
	@GetMapping("/employees/{id}")
	public String employeeById( @PathVariable(value = "id") String id ){
		 return id;
	}*/
	
	
	/**********************POST*************************/
	
	//SIMULATING DATABSE
	List<AddProductModel> list = new ArrayList<AddProductModel>();
	
	
	@PostMapping("/add-product")
	public List<AddProductModel> addNewProduct( @RequestBody() AddProductModel produit ) {
		 
		list.add(produit);
		
		
		return this.list;
	}
	
	
	
}
