import { Types } from '../emums/types';
import { VoitureI } from '../interfaces/voiture-i';

export class Voiture implements VoitureI {
  id!: number;
  origine!: string;
  Type = Types.TERRE;
  roues!: number;
}
