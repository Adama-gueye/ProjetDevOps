package io.reflectoring.demo.reporsitory;

import io.reflectoring.demo.model.Sujet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SujetReporsitory extends JpaRepository<Sujet,Long> {
}
