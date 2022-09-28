import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAdoptionFormComponent } from './add-adoption-form.component';

describe('AddAdoptionFormComponent', () => {
  let component: AddAdoptionFormComponent;
  let fixture: ComponentFixture<AddAdoptionFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddAdoptionFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddAdoptionFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
