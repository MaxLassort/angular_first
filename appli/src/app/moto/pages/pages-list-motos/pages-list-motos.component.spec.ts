import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PagesListMotosComponent } from './pages-list-motos.component';

describe('PagesListMotosComponent', () => {
  let component: PagesListMotosComponent;
  let fixture: ComponentFixture<PagesListMotosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PagesListMotosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PagesListMotosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
