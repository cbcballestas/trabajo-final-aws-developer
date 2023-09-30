package com.cballestas.notasapi.repository;

import com.cballestas.notasapi.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotaRepository extends JpaRepository<Nota, Long> {
    Optional<Nota> findByDNI(String dni);
}
