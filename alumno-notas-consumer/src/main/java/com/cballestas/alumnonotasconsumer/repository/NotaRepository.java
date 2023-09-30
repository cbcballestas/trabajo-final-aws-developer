package com.cballestas.alumnonotasconsumer.repository;

import com.cballestas.alumnonotasconsumer.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
