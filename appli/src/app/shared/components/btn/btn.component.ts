import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-btn',
  templateUrl: './btn.component.html',
  styleUrls: ['./btn.component.scss']
})
export class BtnComponent implements OnInit {
  @Input() className = "btn-dark";
  @Input() label!: string;
  @Input() route!: string;
  constructor() {
    this.className = `btn ${this.className}`;
   }

  ngOnInit(): void {
  }

}
