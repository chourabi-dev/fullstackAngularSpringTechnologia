package com.example.technologia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.technologia.entities.Mark;
import com.example.technologia.entities.Model;
import com.example.technologia.models.AddVehiculeModel;
import com.example.technologia.repositories.*;

@RestController
@RequestMapping("/models")
@CrossOrigin(origins = "*")
public class ModelController {

	@Autowired
	private ModelRepository mr;
	
	@Autowired
	private MarkRepository markR;
	
	
	@GetMapping("/list")
	List<Model> getAllModels(){
		return mr.findAll();
	}
	
	
	@PostMapping("/add")
	public void addNewModel( @RequestBody() AddVehiculeModel m ){
		try {
			Model model = new Model();
			model.setModel(m.getModel());
			model.setMark( this.markR.findById(m.getId_mark()).get()  );
			
			this.mr.save(model);
			
		}catch(Exception e) {
			
		}
	}

}
