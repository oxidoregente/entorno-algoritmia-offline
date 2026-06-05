package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Items (alerta de stock).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para detectar productos por agotarse. Es la base de
 * cualquier sistema de avisos de reposición o de listados "low-stock" en un
 * panel de administración.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link ItemEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method con el sufijo {@code LessThan}.</li>
 *   <li>Spring Data lo traduce a un {@code WHERE stock &lt; ?} en SQL.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;ItemEnunciado&gt; agotandose = repository.findByStockLessThan(5);
 * // -&gt; [Camiseta roja, Botella agua, ...]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Variantes útiles: {@code LessThanEqual}, {@code GreaterThan}, {@code Between}.</li>
 *   <li>El parámetro del método debe ser del mismo tipo que el campo ({@code Integer}).</li>
 * </ul>
 */
public interface ItemRepositoryEnunciado extends JpaRepository<ItemEnunciado, Long> {
    // TODO: Encontrar items con stock menor a un valor
}
