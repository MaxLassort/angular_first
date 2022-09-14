import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Voiture } from 'src/app/core/models/voiture';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class VoitureService {
  public urlApi!: string;
  public collection$ !: Observable<Voiture[]>;

  constructor(private httpClient: HttpClient) {
    this.urlApi = environment.urlApi;
    this.collection$ = this.httpClient.get<Voiture[]>(`${this.urlApi}/voiture`);
   }
}
