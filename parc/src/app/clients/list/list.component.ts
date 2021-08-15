import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  clients=[];
  clientsFilter = [];

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.getClients();
  }

  getClients(){
    this.api.getClientsList().subscribe((res:any)=>{
      console.log(res);
      
      this.clients = res;
      this.clientsFilter = res;
      
    })
  }


  searchFor(e){
    const v = e.target.value;
    console.log(v);

    this.clientsFilter = this.clients.filter((c)=>( c.cin.indexOf(v) != -1) )
    
  }
 

}
