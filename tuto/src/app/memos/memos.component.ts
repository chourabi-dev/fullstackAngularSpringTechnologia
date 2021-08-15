import { Component, OnInit } from '@angular/core';
import { MemosService } from '../memos.service';

@Component({
  selector: 'app-memos',
  templateUrl: './memos.component.html',
  styleUrls: ['./memos.component.css']
})
export class MemosComponent implements OnInit {

  memosList = [];

  constructor( private memos:MemosService ) { }

  ngOnInit(): void {
    this.memosList = this.memos.getMemosList();
  }

  deleteMemo(id){
    if (confirm("Do you really want to delete this memo ?")) {
      this.memos.deleteById(id);
    }
  }
}
