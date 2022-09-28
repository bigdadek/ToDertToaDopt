import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EventClass } from '../models/event-class';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  private baseURL = "http://localhost:8080/event";

  constructor(private httpClient: HttpClient) { }

  getAllEvents(): Observable<EventClass[]>{
    return this.httpClient.get<EventClass[]>(`${this.baseURL}`);
  }

  addEvent(event: EventClass): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, event);
  }

  getEventById(id_event: number): Observable<EventClass>{
    return this.httpClient.get<EventClass>(`${this.baseURL}/${id_event}`);
  }
  updateEvent(id_event: number, event: EventClass): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id_event}`, event);
  }

  deleteEvent(id_event: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id_event}`);
  }
}
