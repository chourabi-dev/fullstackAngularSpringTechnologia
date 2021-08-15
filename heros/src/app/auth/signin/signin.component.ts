import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {

  auth = new FormGroup({
    username:new FormControl(''),
    password:new FormControl('')
  })
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  connect(){
    const user = this.auth.value.username;
    const pass = this.auth.value.password;
    
   if (user==='admin' && pass==='admin') {
     // ok !!
     localStorage.setItem('access-token','123456')
     this.router.navigateByUrl('/products')

   } else {
     alert("wrong uername or password !!")
   }
    
  }

}
