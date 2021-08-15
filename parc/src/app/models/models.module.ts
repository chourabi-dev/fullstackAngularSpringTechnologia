import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ModelsRoutingModule } from './models-routing.module';
import { ModelsComponent } from './models.component';
import { ListComponent } from './list/list.component';
import { AddComponent } from './add/add.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [ModelsComponent, ListComponent, AddComponent],
  imports: [
    CommonModule,
    ModelsRoutingModule,
    FormsModule,ReactiveFormsModule
  ]
})
export class ModelsModule { }
