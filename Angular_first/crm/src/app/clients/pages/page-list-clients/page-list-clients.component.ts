import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { StateClient } from 'src/app/core/enums/state-client';
import { Customer } from 'src/app/core/models/customer';
import { ClientService } from '../../services/client.service';

@Component({
  selector: 'app-page-list-clients',
  templateUrl: './page-list-clients.component.html',
  styleUrls: ['./page-list-clients.component.scss']
})
export class PageListClientsComponent implements OnInit {
  public headers: string[];
  public collection$!: BehaviorSubject<Customer[]>;
  public states!: string[];
  public collection!: Customer[];

  constructor(private clientService: ClientService, private route: Router) {
    this.collection$=clientService.collection$;
    this.clientService.collection$.subscribe(
      (data)=>{
        this.collection=data;
      }
    )

    this.headers = [
      'lastname',
      'firstname',
      'company',
      'mail',
      'phone',
      'adress',
      'zipCode',
      'city',
      'country',
      'active',
      'action'
    ];
    this.states = Object.values(StateClient)
   }

  ngOnInit(): void {
  }

  // public total(coef:number, val: number, tva?: number): number{
  //   if(tva) return coef * val * (1 +tva/100);
  //   return coef * val;
  // }
  //  ah ne pas faire car appellé x fois avec Onchange


  public update(client: Customer, event: any ):void{
    const state = event.target.value;
    console.log(typeof state);
    this.clientService.changeState(client, state).subscribe((data)=>{
      Object.assign(client, data);
    })
  }


  // public changeState(order: Order, state: StateOrder): Observable<Order>{
  //   const obj = new Order(order);
  //   obj.status = state;
  //   return this.update(obj);
  // }

  // public update(order: Order): Observable<Order>{
  //   return this.httpClient.put<Order>(`${this.urlApi}/order-${order.id}`, order)
  // }

  public goToEdit(item: Customer):void{
    this.route.navigate(['clients/edit-client/'], {queryParams: {id:`${item.id}`}})
  }



  public delete(id: number){
    this.clientService.delete(id).subscribe(
      () => {
        this.clientService.collection$.subscribe((data)=>{
          this.collection=data;
        })
      }
    )
  }


}
