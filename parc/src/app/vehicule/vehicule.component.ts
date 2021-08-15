import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-vehicule',
  templateUrl: './vehicule.component.html',
  styleUrls: ['./vehicule.component.css']
})
export class VehiculeComponent implements OnInit {

  status ="chargement..."
  vehicule:any = null;
  id;

/**
 * 	private String description; 
	private double amount;  
	private long id_vehicule;
	private LocalDate date_user;
 */
  add = new FormGroup({
    description :new  FormControl(''),
    amount :new  FormControl(''),
    date_user :new  FormControl(''),
  })

  constructor(private api:ApiService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params.id;

    this.api.getVehiculeById(this.id).subscribe((res:any)=>{
      console.log(res);

      this.vehicule = res;
      this.status=res.matricule
      
    })
  }



  saveIntervention(){
    let intervention = this.add.value;
    intervention.id_vehicule = this.id;

    console.log(intervention);

    this.api.addIntervention(intervention).subscribe((res)=>{
      this.add.reset();

      this.api.getVehiculeById(this.id).subscribe((res:any)=>{
        console.log(res);
  
        this.vehicule = res;
        this.status=res.matricule
        
      })
      
    })
    
  }

}
