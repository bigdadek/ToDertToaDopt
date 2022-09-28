import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { OrphanageClass } from '../models/orphanage-class';

@Injectable({
  providedIn: 'root'
})
export class OrphanageService {

  private baseURL = "http://localhost:8080/orphanage";

  constructor(private httpClient: HttpClient) { }

  getAllOrphanages(): Observable<OrphanageClass[]>{
    return this.httpClient.get<OrphanageClass[]>(`${this.baseURL}`);
  }

  addOrphanage(orphanage: OrphanageClass): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, orphanage);
  }

  getOrphanageById(id_orph: number): Observable<OrphanageClass>{
    return this.httpClient.get<OrphanageClass>(`${this.baseURL}/${id_orph}`);
  }
  updateOrphanage(id_orph: number, orphanage: OrphanageClass): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id_orph}`, orphanage);
  }

  deleteOrphanage(id_orph: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id_orph}`);
  }
} 
