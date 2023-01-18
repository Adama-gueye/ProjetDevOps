package io.reflectoring.demo.service;

import io.reflectoring.demo.model.Etudiant;
import io.reflectoring.demo.reporsitory.EtudiantReporsitory;

import java.util.List;

public class EtudiantServiceImpl implements EtudiantService{

    private EtudiantReporsitory etudiantReporsitory;
    @Override
    public Etudiant creer(Etudiant etudiant) {

        return etudiantReporsitory.save(etudiant);
    }

    @Override
    public List<Etudiant> list() {
        return etudiantReporsitory.findAll();
    }

    @Override
    public Etudiant modifier(long id, Etudiant etudiant) {
        return etudiantReporsitory.findById(id)
                .map(e->{
                    e.setNom(etudiant.getNom());
                    e.setPrenom(etudiant.getPrenom());
                    return etudiantReporsitory.save(e);
                }).orElseThrow(() -> new RuntimeException("Etudiant non Touvé !"));

    }

    @Override
    public String supprimer(long id) {
        etudiantReporsitory.deleteById(id);
        return "Etudiant supprimer avec suces";
    }
}
