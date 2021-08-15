import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VehiculeComponent } from './vehicule/vehicule.component';


const routes: Routes = [
  { path: 'marks', loadChildren: () => import('./marks/marks.module').then(m => m.MarksModule) },
  { path: 'models', loadChildren: () => import('./models/models.module').then(m => m.ModelsModule) },
  { path: 'clients', loadChildren: () => import('./clients/clients.module').then(m => m.ClientsModule) },
  { path:'vehicule/:id', component:VehiculeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
