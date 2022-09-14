import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { BehaviorSubject, Observable, tap } from 'rxjs';
import { StateClient } from 'src/app/core/enums/state-client';
import { Customer } from 'src/app/core/models/customer';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  private urlApi: string;
  public collection$: BehaviorSubject<Customer[]>;


  constructor(private httpClient: HttpClient) {
    this.urlApi = environment.urlApi;
    this.collection$ = new BehaviorSubject<Customer[]>([]);
    this.refreshData();

   }

   public refreshData():void{
    this.httpClient.get<Customer[]>(`${this.urlApi}/customers`).subscribe(
      data => { this.collection$.next(data); }
    );
   }
   public changeState(client: Customer, state: StateClient): Observable<Customer>{
    const obj = new Customer(client);
    obj.active = state;
    return this.put(obj);
  }
   public put(client: Customer):Observable<Customer>{
      return this.httpClient.put<Customer>(`${this.urlApi}/customer-${client.id}`, client).pipe(
        tap(() => {
          this.refreshData();
        })
      );
   }
  public add(client: Customer):Observable<Customer>{
    return this.httpClient.post<Customer>(`${environment.urlApi}/customer`, client).pipe(
      tap(() => {
        this.refreshData();
      })
    );
  }
  public getById(id:number):Observable<Customer>{
    return this.httpClient.get<Customer>(`${this.urlApi}/customer-${id}`)
  }
  public delete(id:number):Observable<Customer>{
    return this.httpClient.delete<Customer>(`${this.urlApi}/customerDelete-${id}`).pipe(
      tap(() => {
        this.refreshData();
      })
    )
  }

}
