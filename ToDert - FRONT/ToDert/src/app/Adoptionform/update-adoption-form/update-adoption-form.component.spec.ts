import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateAdoptionFormComponent } from './update-adoption-form.component';

describe('UpdateAdoptionFormComponent', () => {
  let component: UpdateAdoptionFormComponent;
  let fixture: ComponentFixture<UpdateAdoptionFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateAdoptionFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateAdoptionFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
