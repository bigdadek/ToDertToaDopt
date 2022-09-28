import { TestBed } from '@angular/core/testing';

import { EventSErviceService } from './event-service.service';

describe('EventSErviceService', () => {
  let service: EventSErviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EventSErviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
