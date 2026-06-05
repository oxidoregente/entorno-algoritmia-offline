package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Pedidos (filtro + orden).
 * <b>Dificultad: Media</b>
 *
 * <p>Repositorio JPA que combina un filtro por monto mínimo y una ordenación
 * por fecha descendente en un único Query Method. Patrón típico de listados
 * tipo "pedidos VIP recientes" en un panel de control comercial.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link PedidoEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que combine {@code GreaterThan} con {@code OrderBy...Desc}.</li>
 *   <li>El parámetro es el monto mínimo ({@link Double}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;PedidoEnunciado&gt; vipRecientes =
 *     repository.findByMontoGreaterThanOrderByFechaDesc(100.0);
 * // -&gt; [Pedido(300, hoy), Pedido(150, hace 2 días)]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Estructura: {@code findBy<CampoFiltro>GreaterThanOrderBy<CampoOrden>Desc}.</li>
 *   <li>Si quisieras paginación pasarías un {@link org.springframework.data.domain.Pageable} extra.</li>
 * </ul>
 */
public interface PedidoRepositoryEnunciado extends JpaRepository<PedidoEnunciado, Long> {
    // TODO: Buscar por monto mayor que X ordenado por fecha descendente
    List<PedidoEnunciado> findByMontoGreaterThanOrderByFechaDesc(double monto);
}
