import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAddVoitureComponent } from './Pages/page-add-voiture/page-add-voiture.component';
import { PageEditVoitureComponent } from './Pages/page-edit-voiture/page-edit-voiture.component';
import { PageListVoituresComponent } from './Pages/page-list-voitures/page-list-voitures.component';

const routes: Routes = [
  { path: 'add-voiture', component: PageAddVoitureComponent },
  { path: 'edit-voiture', component: PageEditVoitureComponent },
  { path: '', component: PageListVoituresComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VoitureRoutingModule { }
