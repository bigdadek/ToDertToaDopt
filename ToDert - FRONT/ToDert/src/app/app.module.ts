import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { OrphangesComponent } from './orphanages/orphanges.component';
import { EventsComponent } from './events/events.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { AddKidComponent } from './Kids/add-kid/add-kid.component';
import { UpdateKidComponent } from './Kids/update-kid/update-kid.component';
import { ContactComponent } from './Contact/contact.component';
import { OrphanageSignUpComponent } from './orphanages/orphanage-sign-up/orphanage-sign-up.component';
import { VisitorSignUpComponent } from './User/visitor-sign-up/visitor-sign-up.component';
import { AddEventComponent } from './events/add-event/add-event.component';
import { UpdateEventComponent } from './events/update-event/update-event.component';
import { AllEventComponent } from './events/all-event/all-event.component';
import { ProfileUserComponent } from './User/profile-user/profile-user.component';
import { UpdateUserComponent } from './User/update-user/update-user.component';
import { UpdateOrphanageComponent } from './orphanages/update-orphanage/update-orphanage.component';
import { AddAdoptionFormComponent } from './Adoptionform/add-adoption-form/add-adoption-form.component';
import { UpdateAdoptionFormComponent } from './Adoptionform/update-adoption-form/update-adoption-form.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NgxPaginationModule } from 'ngx-pagination';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
      AppComponent,
      HomeComponent,
      OrphangesComponent,
      EventsComponent,
      SignUpComponent,
      AddKidComponent,
      UpdateKidComponent,
      ContactComponent,
      OrphanageSignUpComponent,
      VisitorSignUpComponent,
      AddEventComponent,
      UpdateEventComponent,
      AllEventComponent,
      ProfileUserComponent,
      UpdateUserComponent,
      UpdateOrphanageComponent,
      AddAdoptionFormComponent,
      UpdateAdoptionFormComponent
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule, 
    Ng2SearchPipeModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
