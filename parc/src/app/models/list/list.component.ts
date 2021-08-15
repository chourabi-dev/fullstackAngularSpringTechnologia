import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  models=[];
  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.getMarks();
  }

  getMarks(){
    this.api.getModelsList().subscribe((res:any)=>{
      console.log(res);
      
      this.models = res;
    })
  }


}
