package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Usuarios.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar usuarios activos registrados después de una fecha específica.</p>
 * <p>Método sugerido: {@code findByActivoTrueAndFechaRegistroAfter(LocalDateTime fecha)}</p>
 */
public interface UsuarioRepositoryEnunciado extends JpaRepository<UsuarioEnunciado, Long> {
    // TODO: Busca usuarios activos registrados después de una fecha
}
