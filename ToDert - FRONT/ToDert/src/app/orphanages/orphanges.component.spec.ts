import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrphangesComponent } from './orphanges.component';

describe('OrphangesComponent', () => {
  let component: OrphangesComponent;
  let fixture: ComponentFixture<OrphangesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrphangesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrphangesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
