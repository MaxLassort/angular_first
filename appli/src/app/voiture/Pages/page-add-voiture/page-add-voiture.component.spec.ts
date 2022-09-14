import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageAddVoitureComponent } from './page-add-voiture.component';

describe('PageAddVoitureComponent', () => {
  let component: PageAddVoitureComponent;
  let fixture: ComponentFixture<PageAddVoitureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageAddVoitureComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageAddVoitureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
