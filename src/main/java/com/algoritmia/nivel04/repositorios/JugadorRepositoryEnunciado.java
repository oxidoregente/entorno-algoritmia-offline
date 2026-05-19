package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Jugadores (Top Ranking).
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un Query Method o consulta @Query para obtener los 3 jugadores con mayor puntaje.</p>
 * <p>Método sugerido: {@code findTop3ByOrderByPuntajeDesc()}</p>
 */
public interface JugadorRepositoryEnunciado extends JpaRepository<JugadorEnunciado, Long> {
    // TODO: Implementa la consulta para Top 3 jugadores
}
