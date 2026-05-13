package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface LogAccesoRepositoryEnunciado extends JpaRepository<LogAccesoEnunciado, Long> {
    // TODO: Buscar logs entre dos fechas dadas
}
