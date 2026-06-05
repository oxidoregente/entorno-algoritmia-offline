package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Productos (filtro compuesto).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA con un Query Method que combina dos condiciones
 * mediante {@code And}: productos con precio menor a un máximo y stock
 * disponible (mayor que cero). Operación típica en buscadores tipo "ofertas
 * disponibles" o filtros de catálogo.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link ProductoEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method con dos cláusulas unidas por {@code And}.</li>
 *   <li>El orden de los parámetros del método debe coincidir con el orden de los campos en el nombre.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;ProductoEnunciado&gt; ofertas =
 *     repository.findByPrecioLessThanAndStockGreaterThan(50.0, 0);
 * // -&gt; [Teclado(25, 3), Ratón(15, 10)]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Patrón: {@code findBy<Campo1><Op1>And<Campo2><Op2>(arg1, arg2)}.</li>
 *   <li>También existe {@code Or} para combinar disyunciones.</li>
 * </ul>
 */
public interface ProductoRepositoryEnunciado extends JpaRepository<ProductoEnunciado, Long> {
    // TODO: Busca productos con precio menor a X y stock mayor a 0
    List<ProductoEnunciado> findByPrecioLessThanAndStockGreaterThan(double precio, int stock);
}
