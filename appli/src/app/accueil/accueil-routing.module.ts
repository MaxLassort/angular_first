import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAccueilComponent } from './components/page-accueil/page-accueil.component';

const routes: Routes = [
  { path: '', component: PageAccueilComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AccueilRoutingModule { }
