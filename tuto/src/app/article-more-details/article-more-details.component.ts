import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-article-more-details',
  templateUrl: './article-more-details.component.html',
  styleUrls: ['./article-more-details.component.css']
})
export class ArticleMoreDetailsComponent implements OnInit {

  id:String= null;

  constructor( private route:ActivatedRoute ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params.id;
  }

}
