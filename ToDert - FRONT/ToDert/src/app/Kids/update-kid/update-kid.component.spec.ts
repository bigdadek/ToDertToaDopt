import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateKidComponent } from './update-kid.component';

describe('UpdateKidComponent', () => {
  let component: UpdateKidComponent;
  let fixture: ComponentFixture<UpdateKidComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateKidComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateKidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
