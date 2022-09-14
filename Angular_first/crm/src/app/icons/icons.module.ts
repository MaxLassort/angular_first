import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IconNavComponent } from './component/icon-nav/icon-nav.component';
import { IconCloseComponent } from './component/icon-close/icon-close.component';
import { IconEditComponent } from './component/icon-edit/icon-edit.component';
import { IconDeleteComponent } from './component/icon-delete/icon-delete.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';



@NgModule({
  declarations: [
    IconNavComponent,
    IconCloseComponent,
    IconEditComponent,
    IconDeleteComponent
  ],
  imports: [
    CommonModule, FontAwesomeModule
  ],
  exports: [
    IconNavComponent,
    IconCloseComponent,
    IconEditComponent,
    IconDeleteComponent
  ]
})
export class IconsModule { }
