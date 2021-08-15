import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  marks=[];
  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.getMarks();
  }

  getMarks(){
    this.api.getMarksList().subscribe((res:any)=>{
      console.log(res);
      
      this.marks = res;
    })
  }

  delete(id){
    if (confirm('do you really want to delete this item ?')) {
      this.api.deleteMarksById(id).subscribe((res)=>{
        this.getMarks();
      })
    }
  }

}
