import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'deletewhitespace'
})
export class DeletewhitespacePipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): string {
   
    let length = value.split(' ').length;
    console.log(length);
    
    let res = value;

    for (let i = 0; i < length; i++) {
      res = res.replace (' ','')
      
    }
 
    
    
    return res;
  }

}
