package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Tickets (cola priorizada).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para alimentar la cola de soporte: dame los tickets de
 * una prioridad concreta, primero los más recientes. Se usa para mostrar la
 * bandeja de entrada de un agente de soporte o un dashboard de incidencias.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link TicketEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que filtre por {@code prioridad} y ordene por {@code fechaCreacion} descendente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * List&lt;TicketEnunciado&gt; urgentes =
 *     repository.findByPrioridadOrderByFechaCreacionDesc("ALTA");
 * // -&gt; [ticket(hoy, ALTA), ticket(ayer, ALTA), ...]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Patrón: {@code findBy<CampoFiltro>OrderBy<CampoOrden>Desc(arg)}.</li>
 *   <li>Si combinaras varios filtros usarías {@code And}/{@code Or} antes de {@code OrderBy}.</li>
 * </ul>
 */
public interface TicketRepositoryEnunciado extends JpaRepository<TicketEnunciado, Long> {
    // TODO: Encontrar tickets por prioridad ordenados por fecha descendente
}
