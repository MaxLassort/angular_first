import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UiComponent } from './component/ui/ui.component';



@NgModule({
  declarations: [
    UiComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    UiComponent
  ]
})
export class UiModule { }
