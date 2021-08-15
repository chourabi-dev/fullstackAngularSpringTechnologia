import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bloc-articles',
  templateUrl: './bloc-articles.component.html',
  styleUrls: ['./bloc-articles.component.css']
})
export class BlocArticlesComponent implements OnInit {

  articles = [
    { 
      title:"hello world Angular ",
      content:'  Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ut consequuntur at dicta, minima a repellat tempore nemo vero sit sapiente blanditiis autem vitae exercitationem corrupti recusandae, suscipit dignissimos voluptatem! Tempore?',
      likes:15,
      comments:[
        { text:"waw Angular is cool !!" , date: new Date()},
        { text:"i agree" , date: new Date()},
        
      ],
      id:'15112336'
    },
    { 
      title:"Angular had more performance than ReactJS ",
      content:'  Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ut consequuntur at dicta, minima a repellat tempore nemo vero sit sapiente blanditiis autem vitae exercitationem corrupti recusandae, suscipit dignissimos voluptatem! Tempore?',
      likes:19,
      comments:[
        { text:"waw Angular is cool !!" , date: new Date()}, 
        
      ],
      id:'15336888'
    },
    
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
