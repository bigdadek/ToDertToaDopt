import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrphanageSignUpComponent } from './orphanage-sign-up.component';

describe('OrphanageSignUpComponent', () => {
  let component: OrphanageSignUpComponent;
  let fixture: ComponentFixture<OrphanageSignUpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrphanageSignUpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrphanageSignUpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
