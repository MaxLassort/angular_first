import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Voiture } from 'src/app/core/models/voiture';
import { VoitureService } from '../../service/voiture.service';

@Component({
  selector: 'app-page-list-voitures',
  templateUrl: './page-list-voitures.component.html',
  styleUrls: ['./page-list-voitures.component.scss']
})
export class PageListVoituresComponent implements OnInit {
  public headers!: string[];
  public collection$!: Observable<Voiture[]>;
  constructor(private voitureService: VoitureService) {
    this.headers=["Origine", "Types", "Roue"]
    this.collection$ = this.voitureService.collection$
   }

  ngOnInit(): void {
  }

}
