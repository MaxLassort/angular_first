import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { StateOrder } from 'src/app/core/enums/state-order';
import { Order } from 'src/app/core/models/order';
import { OrdersService } from '../../services/orders.service';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-page-list-orders',
  templateUrl: './page-list-orders.component.html',
  styleUrls: ['./page-list-orders.component.scss']
})
export class PageListOrdersComponent implements OnInit {

  public myTitle: string;
  public collection$: BehaviorSubject<Order[]>;
  public headers!: string[];
  public states!: string[];
  public params!: HttpParams;


  constructor( private orderService: OrdersService, private router: Router) {
    // on stock le service dans une variable de la classe
    this.collection$ = this.orderService.collection$
    this.myTitle =  "list of orders";
    this.headers = [
      'Type',
      'Client',
      'Durée',
      'prix Unitaire',
      'Total HT',
      'Total TTC',
      'Statut',
      'action'
    ];
    this.states = Object.values(StateOrder);


   }

  ngOnInit(): void {
  }

  public changeTitle(): void{
    this.myTitle = "le titre à changé"
  }

  public chageState(order: Order, event: any){
    const state = event.target.value;
    console.log(typeof state);
    this.orderService.changeState( order, state).subscribe((data)=>{
      Object.assign(order, data);
    });
  }

  public goToEdit(order: Order){
    // this.router.navigate(['orders/edit-order/'], { queryParams: { id: `${order.id}` }});
    this.router.navigate(['orders/edit-order', order.id])
  }
  public goToDelete(id: number):void{
    this.orderService.delete(id).subscribe();
  }

}




/// façon de récupérer les données
// class
 // public collection!:Order[];

 //constructor
 // this.orderService.collection$.subscribe((data)=>{
    //   this.collection=data;
    //   console.log(data);
    // })
