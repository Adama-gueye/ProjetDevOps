package io.reflectoring.demo;

import io.reflectoring.demo.model.Etudiant;
import io.reflectoring.demo.model.Sujet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SujetTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    @Sql("/test2.sql")
    public void getSujetById(){
        ResponseEntity<Sujet> su = testRestTemplate.getForEntity("/sujet/1", Sujet.class);
        assertEquals(1,su.getBody().getId());
        assertEquals("Gueye",su.getBody().getNom());
    }

    @Test
    public void saveEtudiant(){
        Sujet su = new Sujet();
        su.setNom("Gueye");
        HttpEntity<Sujet> httpEntity = new HttpEntity<>(su);
        ResponseEntity<Sujet> suj = testRestTemplate.postForEntity("/sujet/1",httpEntity,Sujet.class);
        assertNotNull(suj.getBody().getId());
        assertEquals(1,suj.getBody().getId());
        assertEquals("Gueye",suj.getBody().getNom());
    }
}
