import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppService } from 'src/app/app.service';

@Component({
  selector: 'app-view-etudiant',
  templateUrl: './view-etudiant.component.html',
  styleUrls: ['./view-etudiant.component.css']
})
export class ViewEtudiantComponent implements OnInit{
  etudiants: any[] | undefined
  url: string = "http://localhost:8080/";

  constructor(private service: AppService, private router: Router) { 
   
  }

  ngOnInit(): void {
    this.service.getEtudiant().subscribe(data => {
      this.etudiants = data;
    })
  }

  deleteEtudiant(id: number){
    this.service.deleteEtudiant(id).subscribe(data => {
      this.etudiants = this.etudiants?.filter(etudiant => etudiant.id !== id);
    })
    
      setTimeout(()=>{
        window.location.reload();
      }, 100);
  
  }

  updateEtudiant(id: number){
    this.router.navigate(['update', id]);
  }

}
