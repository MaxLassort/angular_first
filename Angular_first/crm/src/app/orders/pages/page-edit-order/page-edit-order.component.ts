import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router, RouterLink } from '@angular/router';
import { Observable } from 'rxjs';
import { Order } from 'src/app/core/models/order';
import { OrdersService } from '../../services/orders.service';

@Component({
  selector: 'app-page-edit-order',
  templateUrl: './page-edit-order.component.html',
  styleUrls: ['./page-edit-order.component.scss'],
})
export class PageEditOrderComponent implements OnInit {
  public id!: number;
  public item!: Order;
  //correction
  public id2!: number;
  public order$!: Observable<Order>;

  constructor(
    private orderService: OrdersService,
    private route: ActivatedRoute,
    private navigate: Router
  ) {
    //correction en utilisant snapshot
    this.id2 =this.route.snapshot.params['id'];
    this.order$ = this.orderService.getByid(this.id2)

  }

  ngOnInit(): void {
    // en utilisant queryParams
    // this.route.queryParams.subscribe((params) => {
    //   this.id = Number(params['id']);
    //   this.orderService.getByid(this.id2).subscribe((data) => {
    //     this.item = data;
    //   });
    // });

  }
  public action(order: Order) {
    this.orderService.update(order).subscribe(() => {
      this.navigate.navigate(['orders']);
    });
  }
}
