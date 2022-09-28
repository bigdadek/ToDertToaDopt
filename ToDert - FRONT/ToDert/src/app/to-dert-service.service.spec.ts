import { TestBed } from '@angular/core/testing';

import { ToDertServiceService } from './to-dert-service.service';

describe('ToDertServiceService', () => {
  let service: ToDertServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ToDertServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
