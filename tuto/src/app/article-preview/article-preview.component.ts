import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-article-preview',
  templateUrl: './article-preview.component.html',
  styleUrls: ['./article-preview.component.css']
})
export class ArticlePreviewComponent implements OnInit {

  @Input() title:string;
  @Input() content:string;
  @Input() likes:number;
  @Input() comments:any[];
  @Input() id:string;
  
  commentsIsOpned = false;
  
  constructor() { }

  ngOnInit(): void {
    console.log(this.comments);
    
  }


  openAllComments(){
    this.commentsIsOpned = ! this.commentsIsOpned;
  }

}
