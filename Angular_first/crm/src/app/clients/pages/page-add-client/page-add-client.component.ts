import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from 'src/app/core/models/customer';
import { ClientService } from '../../services/client.service';

@Component({
  selector: 'app-page-add-client',
  templateUrl: './page-add-client.component.html',
  styleUrls: ['./page-add-client.component.scss']
})
export class PageAddClientComponent implements OnInit {
  public title!: string;
  public customer!: Customer;
  constructor(private clientService: ClientService, private router: Router ) {
    this.title = "add";
    this.customer = new Customer();
   }

  ngOnInit(): void {
  }

  public action(customer: Customer):void{
    this.clientService.add(customer).subscribe(()=> {
      this.router.navigate(['clients'])
    });

  }

}
