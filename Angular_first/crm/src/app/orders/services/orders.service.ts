import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, tap } from 'rxjs';
import { StateOrder } from 'src/app/core/enums/state-order';
import { Order } from 'src/app/core/models/order';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class OrdersService {
  private urlApi: string;
  public collection$: BehaviorSubject<Order[]>;

  constructor(private httpClient: HttpClient) {
    this.urlApi = environment.urlApi;
    this.collection$ = new BehaviorSubject<Order[]>([]);
    this.refreshCollection();
  }
  public refreshCollection(): void {
    this.httpClient.get<Order[]>(`${this.urlApi}/orders`).subscribe((data) => {
      this.collection$.next(data);
    });
  }

  public changeState(order: Order, state: StateOrder): Observable<Order> {
    const obj = new Order(order);
    obj.status = state;
    return this.update(obj);
  }

  public update(order: Order): Observable<Order> {
    return this.httpClient
      .put<Order>(`${this.urlApi}/order-${order.id}`, order)
      .pipe(
        tap(() => {
          this.refreshCollection();
        })
      );
  }
  public add(order: Order): Observable<Order> {
    return this.httpClient.post<Order>(`${this.urlApi}/order`, order).pipe(
      tap(() => {
        this.refreshCollection();
      })
    );
  }
  public getByid(id: number): Observable<Order> {
    return this.httpClient.get<Order>(`${this.urlApi}/order-${id}`);
  }

  public delete(id: number): Observable<Order> {
    return this.httpClient
      .delete<Order>(`${this.urlApi}/orderDelete-${id}`).pipe(
        tap(() => {
          this.refreshCollection();
        })
      );
  }
}
