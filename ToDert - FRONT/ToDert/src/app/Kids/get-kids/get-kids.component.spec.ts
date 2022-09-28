import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetKidsComponent } from './get-kids.component';

describe('GetKidsComponent', () => {
  let component: GetKidsComponent;
  let fixture: ComponentFixture<GetKidsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetKidsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GetKidsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
