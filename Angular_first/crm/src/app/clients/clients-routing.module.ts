import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageAddClientComponent } from './pages/page-add-client/page-add-client.component';
import { PageEditClientComponent } from './pages/page-edit-client/page-edit-client.component';
import { PageListClientsComponent } from './pages/page-list-clients/page-list-clients.component';

const routes: Routes = [
  { path: '', component: PageListClientsComponent },
  { path: 'add-client', component: PageAddClientComponent },
  { path: 'edit-client', component: PageEditClientComponent },
  { path: 'edit-client/:id', component: PageEditClientComponent },
  { path: 'list-clients', component: PageListClientsComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientsRoutingModule { }
