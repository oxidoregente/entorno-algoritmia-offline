package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Clientes.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para consultar clientes por su nombre exacto. Es la
 * operación típica de un endpoint {@code GET /clientes?nombre=...} en un CRM.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link ClienteEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method derivado del nombre (sin {@code @Query}).</li>
 *   <li>El método devuelve {@code List<ClienteEnunciado>} porque puede haber varios clientes con el mismo nombre.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;ClienteEnunciado&gt; resultado = repository.findByNombre("Ana");
 * // -&gt; [Ana, Ana] (todas las coincidencias exactas)
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El patrón {@code findBy<Campo>} hace búsqueda por igualdad estricta.</li>
 *   <li>Si quisieras búsqueda parcial usarías {@code findByNombreContaining}.</li>
 * </ul>
 */
public interface ClienteRepositoryEnunciado extends JpaRepository<ClienteEnunciado, Long> {
    // TODO: Buscar clientes por nombre exacto
}
