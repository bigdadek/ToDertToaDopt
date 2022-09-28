import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EventClass } from '../models/event-class';

import { EventService } from './event.service';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent implements OnInit {

  
  events!:EventClass[];

  constructor(private eventService:EventService,private router:Router) { }

  ngOnInit(): void {
    this.getAllEvents();
  }

  private getAllEvents(){
    this.eventService.getAllEvents().subscribe(data => {
      this.events=data;
    });
  }

  updateEvent(id_event: number){
    this.router.navigate(['updateEvent', id_event]);
  }

  deleteEvent(id_event: number){
    this.eventService.deleteEvent(id_event).subscribe( data => {
      console.log(data);
      this.getAllEvents();
    })
  }
  getEvent(id_event: number){
    this.router.navigate(['viewEvent', id_event]);
  }


}
