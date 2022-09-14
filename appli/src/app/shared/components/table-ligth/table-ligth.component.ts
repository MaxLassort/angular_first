import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-table-ligth',
  templateUrl: './table-ligth.component.html',
  styleUrls: ['./table-ligth.component.scss']
})
export class TableLigthComponent implements OnInit {
  @Input() headers!: string[];
  constructor() { }

  ngOnInit(): void {
  }

}
