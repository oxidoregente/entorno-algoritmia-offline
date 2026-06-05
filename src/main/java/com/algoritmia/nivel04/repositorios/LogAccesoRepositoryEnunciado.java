package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Logs de Acceso (filtro por rango).
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para consultar los accesos al sistema dentro de un rango
 * temporal. Es la operación típica de cualquier panel de monitorización o
 * informe de actividad ("muéstrame los accesos entre X e Y").</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link LogAccesoEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method con el sufijo {@code Between}.</li>
 *   <li>El método recibe dos {@link LocalDateTime} (inicio y fin del rango).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * LocalDateTime ayer = LocalDateTime.now().minusDays(1);
 * LocalDateTime hoy  = LocalDateTime.now();
 *
 * List&lt;LogAccesoEnunciado&gt; ultimas24h =
 *     repository.findByFechaAccesoBetween(ayer, hoy);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code Between} es inclusivo en ambos extremos.</li>
 *   <li>Alternativas: {@code findByFechaAccesoAfter(...)} o {@code Before}.</li>
 * </ul>
 */
public interface LogAccesoRepositoryEnunciado extends JpaRepository<LogAccesoEnunciado, Long> {
    // TODO: Buscar logs entre dos fechas
}
