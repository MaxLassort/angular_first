import { Component, OnInit } from '@angular/core';
import { VersionService } from '../../services/version.service';


@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent implements OnInit {

  public version!: number;
  constructor(private versionService: VersionService) {
     this.versionService.version.subscribe((data)=>{this.version=data})
   }

   public update():void{
    this.versionService.upDate()
   }
   //correction

  ngOnInit(): void {
  }

}
