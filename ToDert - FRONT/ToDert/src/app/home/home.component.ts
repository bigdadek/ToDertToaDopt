import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EventService } from '../events/event.service';
import { EventClass } from '../models/event-class';
import { OrphanageClass } from '../models/orphanage-class';
import { OrphanageService } from '../orphanages/orphanage.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  pageSize = 0;
  perPage = 3;
  p: number = 1;

 
  events!:EventClass[];
  orphanages!:OrphanageClass[];


  constructor(private eventService:EventService,private orphanageService:OrphanageService,private router:Router) { }
  
  ngOnInit(): void {
    this.getAllOrphanages();

    this.getAllEvents();
  }

  private getAllEvents(){
    this.eventService.getAllEvents().subscribe(data => {
      this.events=data;
    });
  }
  private getAllOrphanages(){
    this.orphanageService.getAllOrphanages().subscribe(data => {
      this.orphanages=data;
    });
  }

}
