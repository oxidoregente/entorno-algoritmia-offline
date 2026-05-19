package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Tareas.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para encontrar tareas por el ID del proyecto asociado.</p>
 * <p>Método sugerido: {@code findByProyectoId(Long proyectoId)}</p>
 */
public interface TareaRepositoryEnunciado extends JpaRepository<TareaEnunciado, Long> {
    // TODO: Encontrar tareas por ID del proyecto
}
