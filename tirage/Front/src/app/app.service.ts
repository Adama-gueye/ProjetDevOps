import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'
import { Etudiant } from './Etudiant';
import { Sujet } from './Sujet';

@Injectable({
  providedIn: 'root'
})
export class AppService {

  private url = "http://localhost:8080/";

  constructor(private http: HttpClient) { }

  // Add User - Create
  addEtudiant(etudiant: Etudiant){
    return this.http.post<Etudiant>(`${this.url}create`, etudiant)
  }

  // Get Users - Read
  getEtudiant(): Observable<any[]>{
    return this.http.get<any[]>(this.url+'etudiants')
  }

  // Get User by Id - Read
  getEtudiantById(id: number): Observable<Etudiant>{
    return this.http.get<Etudiant>(`${this.url}etudiant/${id}`)
  }

  // Update User - Update
  updateEtudiant(id?: number ,etudiant?: any): Observable<any>{
    return this.http.put<any>(`${this.url}update/${id}`, etudiant)
  }

  // Delete User - Delete
  deleteEtudiant(id: number): Observable<any>{
    return this.http.delete<any>(`${this.url}delete/${id}`)
  }

  addSujet(sujet: Sujet){
    return this.http.post<Etudiant>(`${this.url}create`, sujet)
  }

  // Get Users - Read
  getSujet(): Observable<any[]>{
    return this.http.get<any[]>(this.url+'sujets')
  }

  // Get User by Id - Read
  getSujetById(id: number): Observable<Sujet>{
    return this.http.get<Sujet>(`${this.url}sujet/${id}`)
  }

  // Update User - Update
  updateSujet(id?: number ,sujet?: any): Observable<any>{
    return this.http.put<any>(`${this.url}update/${id}`, sujet)
  }

  // Delete User - Delete
  deleteSujet(id: number): Observable<any>{
    return this.http.delete<any>(`${this.url}delete/${id}`)
  }

}
