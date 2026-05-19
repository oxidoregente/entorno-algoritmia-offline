package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Estudiantes (Pattern Matching).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un Query Method para buscar estudiantes cuyo email termine en un dominio específico.</p>
 * <p>Método sugerido: {@code findByEmailEndingWith(String dominio)}</p>
 */
public interface EstudianteRepositoryEnunciado extends JpaRepository<EstudianteEnunciado, Long> {
    // TODO: Buscar estudiantes cuyo email termine en un dominio
}
