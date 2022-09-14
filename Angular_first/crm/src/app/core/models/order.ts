import { StateOrder } from "../enums/state-order";
import { OrderI } from "../interfaces/order-i";
import { Customer } from "./customer";

export class Order implements OrderI {

  "id" : number;
  "type": string;
  "label" : string;
  "customer": Customer;
  "numberOfDay": number;
  "unitPrice": number;
  "totalExcludeTaxe": number;
  "totalwithTaxe": number;
  "status"= StateOrder.OPTION;

  constructor(obj?: Partial<Order>) {
    if (obj) {
      Object.assign(this, obj);
    }
  }

}
