package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Jugadores (Top Ranking).
 * <b>Dificultad: Media</b>
 *
 * <p>Repositorio JPA para construir un Top 3 de jugadores por puntaje. Es el
 * cimiento de cualquier leaderboard de juego (mejores marcas, ranking diario,
 * scoreboard global).</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link JugadorEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method usando el modificador {@code TopN} en el nombre.</li>
 *   <li>El método debe ordenar por puntaje descendente y devolver solo los 3 primeros.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;JugadorEnunciado&gt; top = repository.findTop3ByOrderByPuntajeDesc();
 * // -&gt; [Morpheo (2000), Trinity (1800), Neo (1500)]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El modificador {@code Top<N>} limita el número de filas (alternativa a {@code Pageable}).</li>
 *   <li>También sirve {@code findFirst3ByOrderByPuntajeDesc()}.</li>
 *   <li>Si necesitaras agregaciones complejas usarías {@link Query} con JPQL.</li>
 * </ul>
 */
public interface JugadorRepositoryEnunciado extends JpaRepository<JugadorEnunciado, Long> {
    // TODO: Implementa la consulta para Top 3 jugadores
}
