import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MarksRoutingModule } from './marks-routing.module';
import { MarksComponent } from './marks.component';
import { ListComponent } from './list/list.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { AddComponent } from './add/add.component';


@NgModule({
  declarations: [MarksComponent, ListComponent, AddComponent],
  imports: [
    CommonModule,
    MarksRoutingModule,
    HttpClientModule,
    FormsModule,ReactiveFormsModule
  ]
})
export class MarksModule { }
