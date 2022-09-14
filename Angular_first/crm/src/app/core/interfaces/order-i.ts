import { StateOrder } from '../enums/state-order';
import { Customer } from '../models/customer';

export interface OrderI {

  "id" : number;
  "type": string;
  "label" : string;
  "customer": Customer;
  "numberOfDay": number;
  "unitPrice": number;
  "totalExcludeTaxe": number;
  "totalwithTaxe": number;
  "status": StateOrder;

}

// id: 1;
//   lastname: string;
//   firstname: string;
//   company: string;
//   mail: string;
//   phone: string;
//   adress: string;
//   zipCode: string;
//   city: string;
//   country: string;
//   active: boolean;
//   orders: Order[];
