import { StateClient } from "../enums/state-client";
import { Order } from "../models/order";

export interface CustomerI {
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
}
