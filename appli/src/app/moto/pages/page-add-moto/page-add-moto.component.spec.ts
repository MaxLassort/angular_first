import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageAddMotoComponent } from './page-add-moto.component';

describe('PageAddMotoComponent', () => {
  let component: PageAddMotoComponent;
  let fixture: ComponentFixture<PageAddMotoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageAddMotoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageAddMotoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
