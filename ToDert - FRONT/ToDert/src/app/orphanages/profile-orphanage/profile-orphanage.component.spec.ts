import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileOrphanageComponent } from './profile-orphanage.component';

describe('ProfileOrphanageComponent', () => {
  let component: ProfileOrphanageComponent;
  let fixture: ComponentFixture<ProfileOrphanageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfileOrphanageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfileOrphanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
