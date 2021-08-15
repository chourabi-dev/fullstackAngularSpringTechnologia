import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ClientsRoutingModule } from './clients-routing.module';
import { ClientsComponent } from './clients.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ListComponent } from './list/list.component';
import { DetailsComponent } from './details/details.component';
import { AddVehiculeComponent } from './add-vehicule/add-vehicule.component';


@NgModule({
  declarations: [ClientsComponent, ListComponent, DetailsComponent, AddVehiculeComponent],
  imports: [
    CommonModule,
    ClientsRoutingModule,
    FormsModule,ReactiveFormsModule
  ]
})
export class ClientsModule { }
