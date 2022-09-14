import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UiComponent } from './component/ui/ui.component';
import { Ui2Component } from './component/ui2/ui2.component';



@NgModule({
  declarations: [
    UiComponent,
    Ui2Component
  ],
  imports: [
    CommonModule
  ],
  exports: [
    UiComponent, Ui2Component
  ]
})
export class UiModule {
  public defaultUi:boolean;

  constructor(){
    this.defaultUi=true;
  }
}
