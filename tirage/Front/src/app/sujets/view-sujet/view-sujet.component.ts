import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppService } from 'src/app/app.service';

@Component({
  selector: 'app-view-sujet',
  templateUrl: './view-sujet.component.html',
  styleUrls: ['./view-sujet.component.css']
})
export class ViewSujetComponent implements OnInit {
  sujets: any[] | undefined
  url: string = "http://localhost:8080/";

  constructor(private service: AppService, private router: Router) { 
   
  }

  ngOnInit(): void {
    this.service.getSujet().subscribe(data => {
      this.sujets = data;
    })
  }

  deleteSujet(id: number){
    this.service.deleteSujet(id).subscribe(data => {
      this.sujets = this.sujets?.filter(sujets => sujets.id !== id);
    })
    
      setTimeout(()=>{
        window.location.reload();
      }, 100);
  
  }

  updateSujet(id: number){
    this.router.navigate(['update', id]);
  }
}
