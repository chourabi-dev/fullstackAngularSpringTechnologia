import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { MemosService } from '../memos.service';

@Component({
  selector: 'app-add-memos',
  templateUrl: './add-memos.component.html',
  styleUrls: ['./add-memos.component.css']
})
export class AddMemosComponent implements OnInit {


  addMemo = new FormGroup({
    title:new FormControl('',Validators.required),
    content:new FormControl('',Validators.required),
    
  })
  constructor(private memoService:MemosService, private router:Router) { }

  ngOnInit(): void {
  }

  saveMemo(){
    let memo = this.addMemo.value;
    memo.date = new Date();


    console.log(memo);

    this.memoService.addNewMemo(memo);

    // save database http 

    // back to memos list
    this.router.navigateByUrl('/memos');
  }
}
