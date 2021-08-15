import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-add-vehicule',
  templateUrl: './add-vehicule.component.html',
  styleUrls: ['./add-vehicule.component.css']
})
export class AddVehiculeComponent implements OnInit {



  /**
   * 
   * 	private String ps;
	
 
	private String matricule;
	 
	private long client_id;
	private long model_id;
   */



  add = new FormGroup({
    ps : new FormControl('',Validators.required),
    matricule: new FormControl('',Validators.required),
    model_id : new FormControl('',Validators.required)
    
  })


  models=[];


  client_id;
 
  

  getModels(){
    this.api.getModelsList().subscribe((res:any)=>{
      console.log(res);
      
      this.models = res;
    })
  }

  constructor(private api:ApiService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.client_id = this.route.snapshot.params.id;
    this.getModels();
  }


  save(){

    let v = this.add.value;
    v.client_id = this.client_id;






    this.api.addNewVehicule(v).subscribe((res)=>{
      this.router.navigateByUrl('/clients')
    },(err)=>{
      alert("Something went wrong please try again")
    })
    

  }

}
