import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageEditMotoComponent } from './page-edit-moto.component';

describe('PageEditMotoComponent', () => {
  let component: PageEditMotoComponent;
  let fixture: ComponentFixture<PageEditMotoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageEditMotoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageEditMotoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
