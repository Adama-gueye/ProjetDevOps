package io.reflectoring.demo.service;

import io.reflectoring.demo.model.Sujet;

import java.util.List;

public interface SujetService {

    Sujet creer(Sujet sujet);

    List<Sujet> list();

    Sujet modifier(long id,Sujet sujet);

    String delete(long id);

}
