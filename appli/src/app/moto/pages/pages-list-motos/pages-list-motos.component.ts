import { Component, OnInit } from '@angular/core';
import { Moto } from 'src/app/core/models/moto';
import { MotoService } from '../../services/moto.service';

@Component({
  selector: 'app-pages-list-motos',
  templateUrl: './pages-list-motos.component.html',
  styleUrls: ['./pages-list-motos.component.scss']
})
export class PagesListMotosComponent implements OnInit {
  public headers:string[];
  public collection!: Moto[];

  constructor(private motoService: MotoService) {
    this.headers=["Origine", "Types", "Roue"]
    motoService.collection$.subscribe((data)=>{
      console.log(data);
      this.collection = data;
    })
   }

  ngOnInit(): void {
  }

}
