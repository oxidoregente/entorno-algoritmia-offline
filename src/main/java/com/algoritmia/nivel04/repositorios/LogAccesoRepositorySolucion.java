package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface LogAccesoRepositorySolucion extends JpaRepository<LogAccesoSolucion, Long> {
    List<LogAccesoSolucion> findByFechaAccesoBetween(LocalDateTime inicio, LocalDateTime fin);
}
