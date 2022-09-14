import { Types } from "../emums/types";
import { MotoI } from "../interfaces/moto-i";

export class Moto implements MotoI {
  id!: number;
  origine!: string;
  Type = Types.CIEL;
  roues!: number;

  constructor(){

  }

}
