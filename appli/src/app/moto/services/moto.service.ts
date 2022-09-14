import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Moto } from 'src/app/core/models/moto';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MotoService {
private urlApi:String;
public collection$!: Observable<Moto[]>
  constructor(httpClient: HttpClient) {
    this.urlApi=environment.urlApi;
    this.collection$= httpClient.get<Moto[]>(`${this.urlApi}/moto`);
   }
}
