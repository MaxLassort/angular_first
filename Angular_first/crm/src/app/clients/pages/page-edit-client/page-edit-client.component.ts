import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Route, Router } from '@angular/router';
import { Customer } from 'src/app/core/models/customer';
import { ClientService } from '../../services/client.service';

@Component({
  selector: 'app-page-edit-client',
  templateUrl: './page-edit-client.component.html',
  styleUrls: ['./page-edit-client.component.scss']
})
export class PageEditClientComponent implements OnInit {
  public item!: Customer;
  constructor(private clientService: ClientService, private route: ActivatedRoute, private navigate: Router) {

   }

  ngOnInit(): void {
    this.route.queryParams.subscribe((param) =>{
      console.log(param);
      let id = Number(param['id']);
      this.clientService.getById(id).subscribe((data)=>{
        this.item = data;
      })
    })
  }

  public action(item: Customer){
    this.clientService.put(item).subscribe(()=>{
      this.navigate.navigate(['clients']);
    })
  }

}
