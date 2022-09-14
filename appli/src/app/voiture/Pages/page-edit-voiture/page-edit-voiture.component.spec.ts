import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageEditVoitureComponent } from './page-edit-voiture.component';

describe('PageEditVoitureComponent', () => {
  let component: PageEditVoitureComponent;
  let fixture: ComponentFixture<PageEditVoitureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageEditVoitureComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageEditVoitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
