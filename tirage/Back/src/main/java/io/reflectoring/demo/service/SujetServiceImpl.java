package io.reflectoring.demo.service;

import io.reflectoring.demo.model.Etudiant;
import io.reflectoring.demo.model.Sujet;
import io.reflectoring.demo.reporsitory.SujetReporsitory;

import java.util.List;

public class SujetServiceImpl implements SujetService{

    private SujetReporsitory sujetReporsitory;
    @Override
    public Sujet creer(Sujet sujet) {

        return sujetReporsitory.save(sujet);
    }

    @Override
    public List<Sujet> list() {
        return sujetReporsitory.findAll();
    }

    @Override
    public Sujet modifier(long id, Sujet sujet) {
        return sujetReporsitory.findById(id)
                .map(s->{
                    s.setNom(sujet.getNom());
                    return sujetReporsitory.save(s);
                }).orElseThrow(() -> new RuntimeException("Sujet non Touvé !"));

    }

    @Override
    public String delete(long id) {
        sujetReporsitory.deleteById(id);
        return "Sujet supprimer avec succes";
    }
}
