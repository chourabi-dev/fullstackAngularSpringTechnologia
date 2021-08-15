import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-discover-us',
  templateUrl: './discover-us.component.html',
  styleUrls: ['./discover-us.component.css']
})
export class DiscoverUsComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  goToSecondPage(){
    this.router.navigateByUrl('/home/ourservices');
    
  }

}
