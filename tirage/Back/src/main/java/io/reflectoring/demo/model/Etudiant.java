package io.reflectoring.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "etudiant")
@Getter
@Setter
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 100)
    private String prenom;

   // @ManyToMany (mappedBy = "etudiants")
    //private Sujet sujet;


}
