package com.example.technologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Vehicule;
import com.example.technologia.models.VehiculeAddModel;
import com.example.technologia.repositories.ClientsRepository;
import com.example.technologia.repositories.ModelRepository;
import com.example.technologia.repositories.VehiculesRepository;

@RestController
@RequestMapping("/vehicules")
public class VehiculesController {
	
	@Autowired
	private VehiculesRepository vr;
	
	@Autowired
	private ClientsRepository cr;
	
	@GetMapping("/VehiculeAddModel")
	List<Vehicule> getAll(){
		return this.vr.findAll();
	}
	
	
	@Autowired
	private ModelRepository mr;
	
	@PostMapping("/add")
	public void addNewVehicuel(@RequestBody VehiculeAddModel vm) {

		try {
			Vehicule v = new Vehicule();
			
			v.setMatricule(vm.getMatricule());
			v.setPs(vm.getPs());
			v.setClient(cr.findById(vm.getClient_id()).get());
			v.setModel(mr.findById(vm.getModel_id()).get());
			
			
			this.vr.save(v);
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
	
	
	

}
