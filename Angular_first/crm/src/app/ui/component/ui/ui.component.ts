import { Component, OnInit } from '@angular/core';
import { UiModule } from '../../ui.module';

@Component({
  selector: 'app-ui',
  templateUrl: './ui.component.html',
  styleUrls: ['./ui.component.scss']
})
export class UiComponent   implements OnInit {

  public close:boolean;

  constructor() {

    this.close=true;
  }

  ngOnInit(): void {
  }

  public toggle():void{
    this.close = !this.close;
  }


}
