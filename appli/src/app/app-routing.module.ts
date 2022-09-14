import { NgModule } from '@angular/core';
import { PreloadAllModules, PreloadingStrategy, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    loadChildren: () => import('./accueil/accueil.module').then(m => m.AccueilModule)
  },
  {
    path: 'moto',
    loadChildren: () => import('./moto/moto.module').then(m => m.MotoModule)
  },
  {
    path: 'voiture',
    loadChildren: () => import('./voiture/voiture.module').then(m => m.VoitureModule)
  },
  {
    path: '**',
    loadChildren: () => import('./page-not-found/page-not-found.module').then(m => m.PageNotFoundModule)
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
