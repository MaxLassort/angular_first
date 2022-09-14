import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAddMotoComponent } from './pages/page-add-moto/page-add-moto.component';
import { PageEditMotoComponent } from './pages/page-edit-moto/page-edit-moto.component';
import { PagesListMotosComponent } from './pages/pages-list-motos/pages-list-motos.component';

const routes: Routes = [
  { path: '', component: PagesListMotosComponent },
  { path: 'add-moto', component: PageAddMotoComponent },
  { path: 'edit-moto', component: PageEditMotoComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MotoRoutingModule { }
