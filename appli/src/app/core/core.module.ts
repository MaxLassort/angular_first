import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IconsModule } from '../icons/icons.module';
import { UiModule } from '../ui/ui.module';
import { TemplatesModule } from '../templates/templates.module';
import { HeaderComponent } from './components/header/header.component';
import { NavComponent } from './components/nav/nav.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './components/footer/footer.component';



@NgModule({
  declarations: [
    HeaderComponent,
    NavComponent,
    FooterComponent
  ],
  imports: [
    CommonModule, RouterModule
  ],
  exports: [IconsModule, TemplatesModule, UiModule, HeaderComponent, NavComponent, FooterComponent]

})
export class CoreModule { }
