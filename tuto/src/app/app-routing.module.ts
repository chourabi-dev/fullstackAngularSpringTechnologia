import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddMemosComponent } from './add-memos/add-memos.component';
import { ArticleMoreDetailsComponent } from './article-more-details/article-more-details.component';
import { BlocArticlesComponent } from './bloc-articles/bloc-articles.component';
import { ContactComponent } from './contact/contact.component';
import { DiscoverUsComponent } from './discover-us/discover-us.component';
import { HomeComponent } from './home/home.component';
import { MemosComponent } from './memos/memos.component';
import { NotFoundRouteComponent } from './not-found-route/not-found-route.component';
import { OurServicesComponent } from './our-services/our-services.component';


const routes: Routes = [
  /*{ path:'', redirectTo:'home', pathMatch:'full' },
  { path:'home' , component:HomeComponent , children:[
    { path:'', component:DiscoverUsComponent },
    { path:'discover', component:DiscoverUsComponent },
    { path:'ourservices', component:OurServicesComponent }
    
  ] }, 
  { path:'about' , component:AboutComponent },
  { path:'contact' , component:ContactComponent },
  { path:'articles' , component:BlocArticlesComponent },
  { path:'details/:id', component:ArticleMoreDetailsComponent },
  { path:'**' , component:NotFoundRouteComponent }*/


  { path:'' , redirectTo:'memos', pathMatch:'full' },
  { path:'memos' , component:MemosComponent  },
  { path:'add-memo', component:AddMemosComponent  }
  
  
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
