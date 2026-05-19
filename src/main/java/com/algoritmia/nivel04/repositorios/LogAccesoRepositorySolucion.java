package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * SOLUCIÓN: Repositorio de Logs de Acceso.
 *
 * <p>Repository JPA para la entidad LogAccesoSolucion con consultas derivadas.</p>
 */
public interface LogAccesoRepositorySolucion extends JpaRepository<LogAccesoSolucion, Long> {
    List<LogAccesoSolucion> findByFechaAccesoBetween(LocalDateTime inicio, LocalDateTime fin);
}
