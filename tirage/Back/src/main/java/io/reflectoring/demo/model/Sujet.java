package io.reflectoring.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sujet")
@Getter
@Setter
@NoArgsConstructor
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50)
    private String nom;
   // @OneToMany (mappedBy = "sujet")
    //private List<Etudiant> etudiants;

}
