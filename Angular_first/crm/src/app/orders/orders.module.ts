import { DEFAULT_CURRENCY_CODE, LOCALE_ID, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OrdersRoutingModule } from './orders-routing.module';
import { PageListOrdersComponent } from './pages/page-list-orders/page-list-orders.component';
import { PageAddOrderComponent } from './pages/page-add-order/page-add-order.component';
import { PageEditOrderComponent } from './pages/page-edit-order/page-edit-order.component';
import { SharedModule } from '../shared/shared.module';
import { registerLocaleData } from '@angular/common';
import localeFr from '@angular/common/locales/fr';
import { FormOrderComponent } from './components/form-order/form-order.component';
registerLocaleData(localeFr);


@NgModule({
  declarations: [
    PageListOrdersComponent,
    PageAddOrderComponent,
    PageEditOrderComponent,
    FormOrderComponent

  ],
  imports: [
    CommonModule,
    OrdersRoutingModule,
    SharedModule
  ],
  providers:[
    {provide: LOCALE_ID, useValue: 'fr-FR'},
    {provide: DEFAULT_CURRENCY_CODE, useValue:'EUR'}
  ]
})
export class OrdersModule { }
