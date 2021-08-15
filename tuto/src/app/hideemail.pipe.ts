import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'hideemail'
})
export class HideemailPipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): unknown {

    // tchourabi@gmail.com
    const firstPart = value.substr(0,5);


    const secondPart = value.split('@')[1];

    const res = firstPart.concat("********").concat(secondPart);
    
    return res;
  }

}
