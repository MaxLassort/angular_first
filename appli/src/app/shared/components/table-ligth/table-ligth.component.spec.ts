import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableLigthComponent } from './table-ligth.component';

describe('TableLigthComponent', () => {
  let component: TableLigthComponent;
  let fixture: ComponentFixture<TableLigthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TableLigthComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TableLigthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
