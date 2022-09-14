import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VersionService {

  public version:BehaviorSubject<number> = new BehaviorSubject<number>(0);

  constructor() {
    
   }

   public upDate():void {
    this.version.next(this.version.value + 1 );
   }
   //correction
   public incrementVersion():void {
    this.version.next(this.version.value + 1);
   }
}
