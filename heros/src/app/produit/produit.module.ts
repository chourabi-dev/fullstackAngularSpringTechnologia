import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProduitRoutingModule } from './produit-routing.module';
import { ProduitComponent } from './produit.component';
import { HomeComponent } from './home/home.component';
import { DetailsComponent } from './details/details.component';


@NgModule({
  declarations: [ProduitComponent, HomeComponent, DetailsComponent],
  imports: [
    CommonModule,
    ProduitRoutingModule
  ]
})
export class ProduitModule { }
