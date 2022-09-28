import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VisitorSignUpComponent } from './visitor-sign-up.component';

describe('VisitorSignUpComponent', () => {
  let component: VisitorSignUpComponent;
  let fixture: ComponentFixture<VisitorSignUpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VisitorSignUpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VisitorSignUpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
