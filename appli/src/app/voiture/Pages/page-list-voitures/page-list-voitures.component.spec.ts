import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageListVoituresComponent } from './page-list-voitures.component';

describe('PageListVoituresComponent', () => {
  let component: PageListVoituresComponent;
  let fixture: ComponentFixture<PageListVoituresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageListVoituresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageListVoituresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
