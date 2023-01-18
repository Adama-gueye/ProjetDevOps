package io.reflectoring.demo.controller;

import io.reflectoring.demo.model.Etudiant;
import io.reflectoring.demo.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping("/create")
    public Etudiant create(@RequestBody Etudiant etudiant){
        return etudiantService.creer(etudiant);
    }
    @GetMapping
    public List<Etudiant> read(){
        return etudiantService.list();
    }
    @PutMapping("/update/{id}")
    public Etudiant update(@PathVariable Long id, @RequestBody Etudiant etudiant){
        return etudiantService.modifier(id,etudiant);
    }
    @DeleteMapping ("/Delete")
    public String delete(@PathVariable Long id){
        return etudiantService.supprimer(id);
    }
}
