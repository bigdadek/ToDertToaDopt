import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { OrphanageClass } from '../models/orphanage-class';
import { OrphanageService } from './orphanage.service';

@Component({
  selector: 'app-orphanges',
  templateUrl: './orphanges.component.html',
  styleUrls: ['./orphanges.component.css']
})
export class OrphangesComponent implements OnInit {

  orphanages!:OrphanageClass[];

  constructor(private orphanageService:OrphanageService,private router:Router) { }

  ngOnInit(): void {
    this.getAllOrphanages();
  }

  private getAllOrphanages(){
    this.orphanageService.getAllOrphanages().subscribe(data => {
      this.orphanages=data;
    });
  }

  updateEvent(id_orph: number){
    this.router.navigate(['updateEvent', id_orph]);
  }

  deleteOrphange(id_orph: number){
    this.orphanageService.deleteOrphanage(id_orph).subscribe( data => {
      console.log(data);
      this.getAllOrphanages();
    })
  }
  getOrphange(id_orph: number){
    this.router.navigate(['task-details', id_orph]);
  }


}
