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
    mark: new FormControl('',Validators.required)
  })

  constructor(private api:ApiService,private router:Router) { }

  ngOnInit(): void {
  }


  save(){
    this.api.addNewMark(this.add.value).subscribe((res)=>{
      this.router.navigateByUrl('/marks')
    },(err)=>{
      alert("Something went wrong please try again")
    })
    

  }

}
