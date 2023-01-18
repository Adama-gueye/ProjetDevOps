package io.reflectoring.demo;


import io.reflectoring.demo.model.Etudiant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EtudiantTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @Sql("/test.sql")
    public void getEtudiantByIdTest(){
        ResponseEntity<Etudiant> et = testRestTemplate.getForEntity("/etudiant/1",Etudiant.class);
        assertEquals(1,et.getBody().getId());
        assertEquals("Gueye",et.getBody().getNom());
        assertEquals("Adama",et.getBody().getPrenom());
    }

    @Test
    public void saveEtudiant(){
        Etudiant et = new Etudiant();
        et.setPrenom("Adama");
        et.setNom("Gueye");
        HttpEntity<Etudiant> httpEntity = new HttpEntity<>(et);
        ResponseEntity<Etudiant> etu = testRestTemplate.postForEntity("/etudiant/1",httpEntity,Etudiant.class);
        assertNotNull(etu.getBody().getId());
        assertEquals(1,etu.getBody().getId());
        assertEquals("Gueye",etu.getBody().getNom());
        assertEquals("Adama",etu.getBody().getPrenom());
    }
}


