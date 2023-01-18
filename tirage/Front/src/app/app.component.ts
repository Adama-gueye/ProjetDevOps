import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'test';
  table = [
    {
      id : 1,
      nom : "gueye",
    },
    {
      id : 2,
      nom : "Adama",
    }
  ];
  isAuth = false;
   onOff(){
    this.isAuth = true;
   }
   onSubmit(form:NgForm){
    console.log(form.value)
  }
  
}
