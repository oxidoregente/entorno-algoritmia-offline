package com.algoritmia.nivel04.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 🎓 RETO: Repositorio de Usuarios (segmento "nuevos y activos").
 * <b>Dificultad: Fácil</b>
 *
 * <p>Repositorio JPA para segmentar usuarios: dame los que están activos y se
 * registraron después de una fecha concreta. Es la consulta típica para
 * disparar campañas de onboarding o medir adquisición reciente.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>Extiende {@link JpaRepository} sobre {@link UsuarioEnunciado} con clave {@link Long}.</li>
 *   <li>Debes añadir un Query Method que combine {@code ActivoTrue} con {@code FechaRegistroAfter}.</li>
 *   <li>El sufijo {@code True}/{@code False} fija la comparación booleana sin necesidad de parámetro.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * LocalDateTime haceUnaSemana = LocalDateTime.now().minusDays(7);
 * List&lt;UsuarioEnunciado&gt; nuevos =
 *     repository.findByActivoTrueAndFechaRegistroAfter(haceUnaSemana);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El método NO recibe el booleano: se fija con {@code True}/{@code False} en el nombre.</li>
 *   <li>{@code After} es estrictamente mayor que (excluye la fecha exacta).</li>
 * </ul>
 */
public interface UsuarioRepositoryEnunciado extends JpaRepository<UsuarioEnunciado, Long> {
    // TODO: Busca usuarios activos registrados después de una fecha
}
