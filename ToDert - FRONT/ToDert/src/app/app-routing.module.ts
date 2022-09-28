import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './Contact/contact.component';
import { EventsComponent } from './events/events.component';
import { HomeComponent } from './home/home.component';
import { GetKidsComponent } from './Kids/get-kids/get-kids.component';
import { OrphangesComponent } from './orphanages/orphanges.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { OrphanageSignUpComponent } from './orphanages/orphanage-sign-up/orphanage-sign-up.component';
import { VisitorSignUpComponent } from './User/visitor-sign-up/visitor-sign-up.component';
import { AddAdoptionFormComponent } from './Adoptionform/add-adoption-form/add-adoption-form.component';
import { UpdateAdoptionFormComponent } from './Adoptionform/update-adoption-form/update-adoption-form.component';
import { AddEventComponent } from './events/add-event/add-event.component';
import { AllEventComponent } from './events/all-event/all-event.component';
import { UpdateEventComponent } from './events/update-event/update-event.component';
import { AddKidComponent } from './Kids/add-kid/add-kid.component';
import { UpdateKidComponent } from './Kids/update-kid/update-kid.component';
import { ProfileUserComponent } from './User/profile-user/profile-user.component';
import { UpdateUserComponent } from './User/update-user/update-user.component';
import { ProfileOrphanageComponent } from './orphanages/profile-orphanage/profile-orphanage.component';
import { UpdateOrphanageComponent } from './orphanages/update-orphanage/update-orphanage.component';

const routes: Routes = [
  {path:'home' , component:HomeComponent},
  {path:'orphanages' , component:OrphangesComponent},
  {path:'events' , component:EventsComponent},
  {path:'contact' , component:ContactComponent},

  {path:'signup' , component:SignUpComponent},
  {path:'signupOrphanage' , component:OrphanageSignUpComponent},
  {path:'signupUser' , component:VisitorSignUpComponent},
  {path:'login' , component:SignUpComponent},

  {path:'profileUser' , component:ProfileUserComponent},
  {path:'profileOrphange' , component:ProfileOrphanageComponent},

  
  {path:'updateUser' , component:UpdateUserComponent},
  {path:'updateOrphanage' , component:UpdateOrphanageComponent},

  {path:'getAllEvents' , component:AllEventComponent},
  {path:'getAllKids' , component:GetKidsComponent},
  {path:'getAllAdoptionForms' , component:HomeComponent},

  {path:'addEvent' , component:AddEventComponent},
  {path:'addKid' , component:AddKidComponent},
  {path:'addAdoptionForm' , component:AddAdoptionFormComponent},

  {path:'updateEvent' , component:UpdateEventComponent},
  {path:'updateKid' , component:UpdateKidComponent},
  {path:'updateAdoptionForm' , component:UpdateAdoptionFormComponent}




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
