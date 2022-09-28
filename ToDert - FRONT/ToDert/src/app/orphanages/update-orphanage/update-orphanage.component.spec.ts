import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateOrphanageComponent } from './update-orphanage.component';

describe('UpdateOrphanageComponent', () => {
  let component: UpdateOrphanageComponent;
  let fixture: ComponentFixture<UpdateOrphanageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdateOrphanageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdateOrphanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
