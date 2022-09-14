import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccueilRoutingModule } from './accueil-routing.module';
import { PageAccueilComponent } from './components/page-accueil/page-accueil.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [
    PageAccueilComponent
  ],
  imports: [
    CommonModule,
    AccueilRoutingModule,
    RouterModule
  ]
})
export class AccueilModule { }
