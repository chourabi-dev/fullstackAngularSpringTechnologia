import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor( private http:HttpClient ) {

  }



  getMarksList(){
    return  this.http.get(environment.apiEndPoint+'/marks/list')
  }
  deleteMarksById(id){
    return  this.http.get(environment.apiEndPoint+'/marks/delete/'+id)
  }
  
  addNewMark(data){
    return  this.http.post(environment.apiEndPoint+'/marks/add',data)
  }



  /******************* */


  getModelsList(){
    return  this.http.get(environment.apiEndPoint+'/models/list')
  }
 
  
  addNewModel(data){
    return  this.http.post(environment.apiEndPoint+'/models/add',data)
  }

  /************************* */

  
  getClientsList(){
    return  this.http.get(environment.apiEndPoint+'/clients/list')
  }
 
  
  addNewClient(data){
    return  this.http.post(environment.apiEndPoint+'/clients/add',data)
  }

  getClientByCin(cin){
    return  this.http.get(environment.apiEndPoint+'/clients/details/'+cin)
  }


  /**************************** */

  getVehiculeById(id){
    
    return  this.http.get(environment.apiEndPoint+'/vehicules/details/'+id)

  }


  addIntervention(data){
    return  this.http.post(environment.apiEndPoint+'/Interventions/add',data)
  }



  addNewVehicule(data){
    return  this.http.post(environment.apiEndPoint+'/vehicules/add',data)
  }

  
}
