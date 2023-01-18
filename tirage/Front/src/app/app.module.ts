import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule }  from '@angular/forms';
import { AddEtudiantComponent } from './etudiants/add-etudiant/add-etudiant.component';
import { UpdateEtudiantComponent } from './etudiants/update-etudiant/update-etudiant.component';
import { ViewEtudiantComponent } from './etudiants/view-etudiant/view-etudiant.component';
import { AddSujetComponent } from './sujets/add-sujet/add-sujet.component';
import { UpdateSujetComponent } from './sujets/update-sujet/update-sujet.component';
import { ViewSujetComponent } from './sujets/view-sujet/view-sujet.component';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule}  from '@angular/common/http';

const routes: Routes = [
  { path: '', component: ViewEtudiantComponent },
  { path: 'add-etudiant.component.html/create', component: AddEtudiantComponent },
  { path: 'update-etudiant.component.html/:id', component: UpdateEtudiantComponent },
  { path: 'view-sujet.component.html', component: ViewSujetComponent },
  { path: 'add-sujet.component.html/create', component: AddSujetComponent },
  { path: 'update-sujet.component.html/update/:id', component: UpdateSujetComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    AddEtudiantComponent,
    UpdateEtudiantComponent,
    ViewEtudiantComponent,
    AddSujetComponent,
    UpdateSujetComponent,
    ViewSujetComponent
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
