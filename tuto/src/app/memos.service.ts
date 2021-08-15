import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MemosService {

  private memos = [
    { title:'test memo', content:"test content" , date: new Date() , id:15 }
  ]
  constructor() { }


  public getMemosList(){
    // call database! !! ! !
    return this.memos;
  }


  public addNewMemo(data:any){
    const newId = this.memos.length+1;
    data.id = newId;
    this.memos.push(data)
  }

  public deleteById(id){
    for (let i = 0; i < this.memos.length; i++) {
      const memo = this.memos[i];
      if (memo.id == id) {
        this.memos.splice(i,1);
      }
      
    }
  }
}
