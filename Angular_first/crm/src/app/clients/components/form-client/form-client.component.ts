import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StateClient } from 'src/app/core/enums/state-client';
import { Customer } from 'src/app/core/models/customer';

@Component({
  selector: 'app-form-client',
  templateUrl: './form-client.component.html',
  styleUrls: ['./form-client.component.scss']
})
export class FormClientComponent implements OnInit {
  @Input() init!: Customer;
  @Output() public submited!:EventEmitter<Customer>;
  public addForm!: FormGroup;
  public active!: String[];

  constructor(private formBuilder: FormBuilder) {
    this.submited = new EventEmitter<Customer>;
    this.active = Object.values(StateClient)
  }

  ngOnInit(): void {
    this.addForm = this.formBuilder.group({
      id: [this.init.id],
      lastname: [this.init.lastname, Validators.required],
      firstname: [this.init.firstname],
      company: [this.init.company],
      mail: [this.init.mail, Validators.email],
      phone: [this.init.phone],
      adress: [this.init.adress],
      zipcode: [this.init.zipCode],
      city: [this.init.city],
      country:[this.init.country],
      active:[this.init.active],

  })
  }

  public onSubmit():void {
      this.submited.emit(this.addForm.value);
    }
}
