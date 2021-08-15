import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  menu = [
    { 
      title:"Marks",
      link:"/marks",
      icon:"fas fa-key"
    },
    {
      title:"Models",
      link:"/models",
      icon:"fas fa-glass-whiskey"
    },
    {
      title:"Clients",
      link:"/clients",
      icon:"fas fa-users"
    },
    
    
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
