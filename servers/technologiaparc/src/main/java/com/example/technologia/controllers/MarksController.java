package com.example.technologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Mark;
import com.example.technologia.repositories.MarkRepository;

@RestController
@RequestMapping("/marks")
@CrossOrigin(origins = "*")
public class MarksController {
	
	@Autowired
	private MarkRepository mr;
	
	
	@GetMapping("/list")
	List<Mark> getAllMarks(){
		return mr.findAll();
	}
	
	@GetMapping("/delete/{id}")
	public void delete( @PathVariable long id ){
		try {
			Mark m = this.mr.findById(id).get();
			
			this.mr.delete(m);
		}catch(Exception e) {
			
		}
		
	}
	
	
	@PostMapping("/add")
	public void addNewMark( @RequestBody() Mark m ){
		 this.mr.save(m);
	}

}
