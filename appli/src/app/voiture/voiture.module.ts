import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VoitureRoutingModule } from './voiture-routing.module';
import { SharedModule } from '../shared/shared.module';
import { PageListVoituresComponent } from './Pages/page-list-voitures/page-list-voitures.component';


@NgModule({
  declarations: [
    PageListVoituresComponent
  ],
  imports: [
    CommonModule,
    VoitureRoutingModule,
    SharedModule
  ],
  exports: [
    PageListVoituresComponent
  ]
})
export class VoitureModule { }
