import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AppService } from 'src/app/app.service';
import { Sujet } from 'src/app/Sujet';


@Component({
  selector: 'app-update-sujet',
  templateUrl: './update-sujet.component.html',
  styleUrls: ['./update-sujet.component.css']
})
export class UpdateSujetComponent implements OnInit{
  sujet?: Sujet
  data: any


  constructor(private service: AppService, private route: ActivatedRoute, private router : Router) { }

  ngOnInit(): void {
    let id = this.route.snapshot.params['id'];
    this.service.getEtudiantById(id).subscribe(data => {
      this.sujet = data
      console.log(this.sujet)
    })
  }

  form = new FormGroup({
    nom: new FormControl('', [Validators.required])
  })

  submit(){
    this.data = this.form.value
    console.log(this.data)
    
    this.service.updateEtudiant(this.sujet?.id, this.data).subscribe(data => {
      console.log(data)
    })

    this.router.navigate(['/']);
  }
}
