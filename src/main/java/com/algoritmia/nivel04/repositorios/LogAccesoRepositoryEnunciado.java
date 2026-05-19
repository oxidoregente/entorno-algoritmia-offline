package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Logs de Acceso.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar logs de acceso entre dos fechas.</p>
 * <p>Método sugerido: {@code findByFechaAccesoBetween(LocalDateTime inicio, LocalDateTime fin)}</p>
 */
public interface LogAccesoRepositoryEnunciado extends JpaRepository<LogAccesoEnunciado, Long> {
    // TODO: Buscar logs entre dos fechas
}
