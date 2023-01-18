package io.reflectoring.demo.reporsitory;
import io.reflectoring.demo.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EtudiantReporsitory extends JpaRepository<Etudiant,Long> {

        int val = 10;
        @Query(value = "SELECT * FROM etudiant LIMIT val", nativeQuery=true)
        Etudiant findRandom();
}
