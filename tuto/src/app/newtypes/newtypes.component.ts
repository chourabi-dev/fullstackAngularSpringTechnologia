import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-newtypes',
  templateUrl: './newtypes.component.html',
  styleUrls: ['./newtypes.component.css']
})
export class NewtypesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    /*this.callC1().then((data)=>{
      this.callC2(data).then((res2)=>{
        this.callC3(res2).then((res3)=>{
          console.log("response from c3",res3);
          
        }).catch((err)=>{})
      }).catch((err)=>{})
    }).catch((e)=>{

    })*/

    //this.makeCalls();



    // watch position via observable
    let locations = new Observable((observer)=>{


      let interval = setInterval(()=>{
        console.log("still sending data !! :o");
        
        observer.next('data');
      },2000)

      return{
        unsubscribe(){
          clearInterval(interval);
        }
      }
       
    })


    let watch = locations.subscribe((flux)=>{
      console.log(flux);
      
    },(err)=>{

    })


    setTimeout(()=>{
      watch.unsubscribe();
    },7000);










  }


  // promise
/*
  async makeCalls() {
    let resC1 = await this.callC1();
    
    let resC2 = await this.callC2(resC1);
    
    let resC3 = await this.callC3(resC2);
    
    
    

  }


  callC1(){
    console.log("calling c1");
    
    var promise = new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve({ calls: 1 })
      },4000)

    })

    return promise;
  }

  callC2(data){
    console.log("calling c2");
    var promise = new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve({ calls: (data.calls+1) })
      },2000)

    })

    return promise;
  }

  callC3(data){
    console.log("calling c3");
    var promise = new Promise((resolve,reject)=>{
      setTimeout(()=>{
        resolve({ calls: (data.calls+1) })
      },3000)

    })

    return promise;
  }*/



  //observable

 


}
