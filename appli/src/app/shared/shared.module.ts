import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { BtnComponent } from './components/btn/btn.component';
import { TableLigthComponent } from './components/table-ligth/table-ligth.component';

@NgModule({
  declarations: [
    BtnComponent,
    TableLigthComponent
  ],
  imports: [CommonModule, RouterModule],
  exports: [
    BtnComponent,
    TableLigthComponent
  ],
})
export class SharedModule {}
