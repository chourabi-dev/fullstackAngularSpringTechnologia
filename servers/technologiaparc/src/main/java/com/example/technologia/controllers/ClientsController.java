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

import com.example.technologia.entities.Client;
import com.example.technologia.entities.Mark;
import com.example.technologia.repositories.*;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*")
public class ClientsController {

	@Autowired
	private ClientsRepository cr;
	
	
	@GetMapping("/list")
	List<Client> getAll(){
		return cr.findAll();
	}
	
	
	@GetMapping("/details/{cin}")
	Client getAll( @PathVariable String cin ){
		List<Client> clients = this.cr.findAll();
		
		for(Client c:clients) {
			if( c.getCin().equals(cin) ) {
				return c;
			}
		}
		
		return null;
		
	}
	
	
	@PostMapping("/add")
	public void addNewMark( @RequestBody() Client c ){
		 this.cr.save(c);
	}

}
