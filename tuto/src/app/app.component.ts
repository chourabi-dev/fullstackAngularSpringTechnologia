import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   
   title:string  =   " Welcome to angular spring from the TS file ";

   /*arrayOfFruits = [ 
      { name:"Mango" , quantity:60 , isOld:true },
      { name:"Apples" , quantity:50 , isOld:false },
      { name:"Water malone" , quantity:30, isOld:false  },

   ]


   photoURL = ['https://wallpapercave.com/wp/wp3145243.jpg','https://wallpapercave.com/wp/aI60no1.jpg'];
   selectedIndex = 0;*/


   //content = "hello <strong>world";



      /**
    *    custromForm = new FormGroup({
    fullname : new FormControl('',Validators.required),
    email : new FormControl('',[Validators.email,Validators.required]),
    password : new FormControl('',Validators.maxLength(8)),

    address : new FormGroup({
      city : new FormControl('',Validators.pattern('[a-zA-Z ]a[1-9]')),
      zipCode : new FormControl('',Validators.required),
      state : new FormControl('',Validators.required)
      
    })
     
   });
    */


/*
   isRed = false;

   canBeClicked = false

   step = 0;



   formOne = new FormGroup({
    username: new FormControl('',Validators.required),
    email: new FormControl('',Validators.required),
     
   })
   formTwo = new FormGroup({
    phoneNumber: new FormControl('',Validators.required),
    address: new FormControl('',Validators.required),
     
   })
   


   users = [];
*/

/*

  users = [
      //    xxxx
    { name:"chourabi taher" , phonenumber:"93863732"},
    { name:"Test user" , phonenumber:"11225566"},
    { name:"John wick" , phonenumber:"99663322"},
    { name:"Jason test" , phonenumber:"77889966"},
    { name:"Jmaes brow" , phonenumber:"22554477"},
    
  ];


  usersFilterd = [
    //    xxxx
  { name:"chourabi taher" , phonenumber:"93863732"},
  { name:"Test user" , phonenumber:"11225566"},
  { name:"John wick" , phonenumber:"99663322"},
  { name:"Jason test" , phonenumber:"77889966"},
  { name:"Jmaes brow" , phonenumber:"22554477"},
  
];
*/


  constructor(){
  }
/*
  searching(e){
    const query = e.target.value.toLowerCase();

    let res = this.users.filter((u)=> (u.name.toLowerCase() .indexOf(query) != -1  )  || (u.phonenumber .indexOf(query) != -1)        )
    
    this.usersFilterd = res
    
  }


  /*deleteWhiteSpace(mot:string){
    return mot.replace(' ', '');

  }*/




/*


  validateForm(){
    /*const fv = this.custromForm.value;
    console.log(fv);
    
    
  }



  next(){
    this.step++;
  }


  saveUser(){
    const user = {
      personalInformation: this.formOne.value,
      contactInfomation: this.formTwo.value
    }

    this.formOne.reset();
    this.formTwo.reset();

    this.step = 0;
    
    this.users.push(user);

    // app http server


  }*/



  // pipes 

  //val = new Date();
/*
  val = "hello world, angular is awesome !!"



 email = "tchourabi@gmail.com";
 // tch*******@****.com*/


 val = "test";


 checkInputVal(){
   console.log(this.val);
   
 }







  
}
