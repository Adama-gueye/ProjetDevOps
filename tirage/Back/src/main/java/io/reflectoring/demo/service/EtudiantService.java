package io.reflectoring.demo.service;

import io.reflectoring.demo.model.Etudiant;

import java.util.List;

public interface EtudiantService {

     Etudiant creer(Etudiant etudiant);

     List<Etudiant> list();

     Etudiant modifier(long id, Etudiant etudiant);

     String supprimer(long id);
}
