import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EventClass } from '../models/event-class';
import { OrphanageClass } from '../models/orphanage-class';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  private baseURL = "http://localhost:8080/event";

  constructor(private httpClient: HttpClient) { }

  getAllEvents(): Observable<EventClass[]>{
    return this.httpClient.get<EventClass[]>(`${this.baseURL}`);
  }
 
  getAllOrphanages(): Observable<OrphanageClass[]>{
    return this.httpClient.get<OrphanageClass[]>(`${this.baseURL}`);
  }

}
