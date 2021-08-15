import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  add = new FormGroup({
    id_mark : new FormControl('',Validators.required),
    model: new FormControl('',Validators.required)
  })


  marks=[];
 
  

  getMarks(){
    this.api.getMarksList().subscribe((res:any)=>{
      console.log(res);
      
      this.marks = res;
    })
  }

  constructor(private api:ApiService,private router:Router) { }

  ngOnInit(): void {
    this.getMarks();
  }


  save(){
    this.api.addNewModel(this.add.value).subscribe((res)=>{
      this.router.navigateByUrl('/models')
    },(err)=>{
      alert("Something went wrong please try again")
    })
    

  }

}
