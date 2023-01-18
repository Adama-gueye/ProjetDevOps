import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AppService } from 'src/app/app.service';

@Component({
  selector: 'app-add-sujet',
  templateUrl: './add-sujet.component.html',
  styleUrls: ['./add-sujet.component.css']
})
export class AddSujetComponent implements OnInit{
  constructor(private service: AppService, private router: Router) { }
  data: any
  
  form = new FormGroup({
    nom: new FormControl('', [Validators.required])
  })
  ngOnInit(): void {
  }
  submit(){
    this.data = this.form.value
    console.log(this.data)

    this.service.addSujet(this.data).subscribe(data => {
      console.log(data)
    })
    this.router.navigate(['/']);
  }
}
