package com.example.technologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Intervention;
import com.example.technologia.entities.Vehicule;
import com.example.technologia.models.InterventionAddModel;
import com.example.technologia.repositories.InterventionRepository;
import com.example.technologia.repositories.VehiculesRepository;


@RestController
@RequestMapping("/Interventions")
@CrossOrigin(origins = "*")
public class InterventionController {

	
	@Autowired
	private InterventionRepository ir;
	
	
	@Autowired
	private VehiculesRepository vr;
	
	
	@GetMapping("/list")
	List<Intervention> getAll(){
		return this.ir.findAll();
	}
	
	
	@PostMapping("/add")
	public void addIntervention(@RequestBody() InterventionAddModel i ) {
		try {
			Intervention in = new Intervention();
			
			in.setAmount(i.getAmount());
			in.setDescription(i.getDescription());
			in.setVehicule( vr.findById(i.getId_vehicule()).get() );
			
			in.setDate_user(i.getDate_user());
			
			this.ir.save(in);
			
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	
	
	
}
