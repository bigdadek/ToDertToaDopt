import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

import { Router } from '@angular/router';
import { EventClass } from 'src/app/models/event-class';
import { EventService } from '../event.service';

@Component({
  selector: 'app-add-event',
  templateUrl: './add-event.component.html',
  styleUrls: ['./add-event.component.css']
})
export class AddEventComponent implements OnInit {

  
  event:EventClass=new EventClass();
  
  constructor(private eventService:EventService,private router:Router) { }

  ngOnInit(): void {
  }

  saveEvent(){
    this.eventService.addEvent(this.event).subscribe( data =>{
      console.log(data);
      this.getAllEvents();
    },
    error => console.log(error));
  }

  getAllEvents(){
    this.router.navigate(['/event']);
  }
  
  onSubmit(){
    console.log(this.event);
    this.saveEvent();
  }

}
