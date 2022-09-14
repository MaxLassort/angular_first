import { StateClient } from "../enums/state-client";
import { CustomerI } from "../interfaces/customer-i";
import { Order } from "./order";

export class Customer implements CustomerI {
  'id': number;
  'lastname': string;
  'firstname': string;
  'company': string;
  'mail': string;
  'phone': string;
  'adress': string;
  'zipCode': string;
  'city': string;
  'country': string;
  'active': StateClient;
  'orders': Order;

  constructor(obj?: Partial<Customer>) {
    if (obj) {
      Object.assign(this, obj);
    }
  }
}
