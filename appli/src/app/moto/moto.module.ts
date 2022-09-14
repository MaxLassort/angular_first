import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MotoRoutingModule } from './moto-routing.module';
import { PagesListMotosComponent } from './pages/pages-list-motos/pages-list-motos.component';
import { SharedModule } from '../shared/shared.module';
import { PageAddMotoComponent } from './pages/page-add-moto/page-add-moto.component';
import { PageEditMotoComponent } from './pages/page-edit-moto/page-edit-moto.component';


@NgModule({
  declarations: [
    PagesListMotosComponent,
    PageAddMotoComponent,
    PageEditMotoComponent
  ],
  imports: [
    CommonModule,
    MotoRoutingModule,
    SharedModule
  ]
})
export class MotoModule { }
