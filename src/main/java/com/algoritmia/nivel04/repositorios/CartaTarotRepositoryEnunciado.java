package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Cartas de Tarot.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para consultar el mazo de cartas. Sirve en backends de
 * apps esotéricas para devolver las cartas filtradas por tipo de arcano y
 * presentarlas alfabéticamente al usuario.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link CartaTarotEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method derivado del nombre (sin {@code @Query}).</li>
 *   <li>El resultado debe ordenarse por {@code nombre} ascendente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;CartaTarotEnunciado&gt; mayores =
 *     repository.findByArcanoOrderByNombreAsc(Arcano.MAYOR);
 * // -&gt; [El Loco, El Mago, El Sol, ...]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Spring Data deriva la SQL del nombre: {@code findBy<Campo>OrderBy<Campo>Asc}.</li>
 *   <li>El parámetro del método es del tipo {@code CartaTarotEnunciado.Arcano}.</li>
 * </ul>
 */
public interface CartaTarotRepositoryEnunciado extends JpaRepository<CartaTarotEnunciado, Long> {
    // TODO: Buscar por arcano ordenado por nombre ascendente
    List<CartaTarotEnunciado> findByArcanoOrderByNombreAsc(CartaTarotEnunciado.Arcano arcano);
}
