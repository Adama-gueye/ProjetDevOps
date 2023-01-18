package io.reflectoring.demo.controller;


import io.reflectoring.demo.model.Sujet;
import io.reflectoring.demo.service.SujetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/sujet")
public class SujetController {
    @Autowired
    private SujetService sujetService;
    public void SujetService(SujetService sujetService) {
        this.sujetService = sujetService;
    }
    @PostMapping("/create")
    public Sujet create(@RequestBody Sujet sujet){
        return sujetService.creer(sujet);
    }
    @GetMapping
    public List<Sujet> read(){
        return sujetService.list();
    }
    @PutMapping("/update/{id}")
    public Sujet update(@PathVariable Long id, @RequestBody Sujet etudiant){
        return sujetService.modifier(id,etudiant);
    }
    @DeleteMapping ("/delete")
    public String delete(@PathVariable Long id){
        return sujetService.delete(id);
    }
}
