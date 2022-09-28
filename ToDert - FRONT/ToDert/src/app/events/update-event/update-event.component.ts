import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { EventClass } from 'src/app/models/event-class';
import { EventService } from '../event.service';

@Component({
  selector: 'app-update-event',
  templateUrl: './update-event.component.html',
  styleUrls: ['./update-event.component.css']
})
export class UpdateEventComponent implements OnInit {

  id_event!:number;
  event:EventClass=new EventClass();

  constructor(private eventService : EventService,private router:Router,private route : ActivatedRoute) { }

  ngOnInit(): void {
    this.id_event = this.route.snapshot.params['id_event'];

    this.eventService.getEventById(this.id_event).subscribe(data => {
      this.event = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.eventService.updateEvent(this.id_event,this.event).subscribe( data =>{
      this.goToEventsList();
    }
    , error => console.log(error));
  }

  goToEventsList(){
    this.router.navigate(['/event']);
  }

}
