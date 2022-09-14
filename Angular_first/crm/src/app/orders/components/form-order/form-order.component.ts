import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ClientService } from 'src/app/clients/services/client.service';
import { StateOrder } from 'src/app/core/enums/state-order';
import { Customer } from 'src/app/core/models/customer';
import { Order } from 'src/app/core/models/order';

@Component({
  selector: 'app-form-order',
  templateUrl: './form-order.component.html',
  styleUrls: ['./form-order.component.scss'],
})
export class FormOrderComponent implements OnInit {
  @Input() public init!: Order;
  @Output() public submitted!: EventEmitter<Order>;
  public states: string[];
  public customers!: Customer[];
  public addForm!: FormGroup;
  public formClient!: FormGroup;
  constructor(private clientService: ClientService, private formBuilder: FormBuilder) {
    this.states = Object.values(StateOrder);
    this.submitted = new EventEmitter<Order>();
    this.clientService.collection$.subscribe((data)=>{
      this.customers = data;
    })
  }

  ngOnInit(): void {
    this.addForm =this.formBuilder.group({
      type: [this.init.type],
      customer: [this.init.customer],
      numberOfDay: [this.init.numberOfDay],
      unitPrice: [this.init.unitPrice],
      status: [this.init.status],
      id: [this.init.id],
      customerId:[this.init.customer ? this.init.customer.id : 0]

    })
  }
  public onSubmit(){
    let indexCustomer = this.customers.findIndex((i)=>{
      return i.id === this.addForm.value.customerId;
    });
    this.addForm.controls['customer'].setValue(this.customers[indexCustomer]);
    // console.log(this.addForm.value.customer);
    this.submitted.emit(this.addForm.value);
  }
}
