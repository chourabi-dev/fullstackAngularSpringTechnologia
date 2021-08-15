package com.example.technologia.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Notes;
import com.example.technologia.model.AddNewNoteModel;
import com.example.technologia.model.ResponseModel;
import com.example.technologia.repositories.NotesRepository;

@RestController
@RequestMapping("/notes")

public class NotesController {

	@Autowired
	private NotesRepository nr;
	
	
	@GetMapping("/list")
	public List<Notes> getNotesList(){
		// call database SELECT FROM ... JPA
		// SELECT * FROM notes
		return this.nr.findAll();
		
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseModel deletenote( @PathVariable( name = "id" ) Long id ) {
		ResponseModel rm = new ResponseModel();
		try {
			Notes n = this.nr.findById(id).get(); 

			// save !!
			// DELETE into notes ...
			this.nr.delete(n);
			rm.setSuccess(true);
			rm.setMessage("Note deleted successfully"); 
			return rm; 
		}catch(Exception e) { 
			rm.setSuccess(false);
			rm.setMessage(e.getMessage());
			return rm;
		}
	
	}
	
	
	@PostMapping("/add")
	public void addNewNote(@RequestBody() AddNewNoteModel tmp) {
		try {
			Notes n = new Notes();
			
			
			/*
			 * if(tmp.length ) ...
			 * */
			
			n.setTitle(tmp.getContent());
			n.setContent(tmp.getContent());
			
			// save !!
			// INSERT into notes ...
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			
			Set<ConstraintViolation<Notes>> violations = validator.validate(n);
			
			for (ConstraintViolation<Notes> violation : violations) {
				System.out.print(violation.getMessage()); 
			}
			
			
			this.nr.save(n);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	
	@PostMapping("/update/{id}")
	public ResponseModel updateNote(@RequestBody() AddNewNoteModel tmp, @PathVariable( name = "id" ) Long id ) {
		ResponseModel rm = new ResponseModel();
		try {
			Notes n = this.nr.findById(id).get();  
		    n.setTitle(tmp.getContent());
			n.setContent(tmp.getContent()); 
			// save !!
			// UPDATE into notes ...
			this.nr.save(n);
			rm.setSuccess(true);
			rm.setMessage("Note updated successfully"); 
			return rm; 
		}catch(Exception e) { 
			rm.setSuccess(false);
			rm.setMessage(e.getMessage());
			return rm;
		}
		
	}
}
