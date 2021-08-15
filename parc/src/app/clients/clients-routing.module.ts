import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddVehiculeComponent } from './add-vehicule/add-vehicule.component';

import { ClientsComponent } from './clients.component';
import { DetailsComponent } from './details/details.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [
  { path: '', component: ListComponent },
  { path: 'details/:id', component: DetailsComponent },
  { path: 'details/:id/add-vehicule', component: AddVehiculeComponent },
  
  

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientsRoutingModule { }
