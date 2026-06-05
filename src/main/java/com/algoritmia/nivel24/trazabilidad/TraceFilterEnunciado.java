package com.algoritmia.nivel24.trazabilidad;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

/**
 * 🎓 RETO: Intercepción de Trazas en HTTP.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Cuando un cliente reporta un error, poder cruzar el log del servidor con
 * la traza de Zipkin es oro puro. Devolver el <code>TraceID</code> en una
 * cabecera HTTP (<code>X-Trace-Id</code>) permite al cliente incluirlo en su
 * ticket de soporte y acelerar el diagnóstico.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Extiende <code>OncePerRequestFilter</code> para garantizar una única ejecución por petición.</li>
 *   <li>Usa el <code>Tracer</code> de Micrometer para obtener el span actual y leer su <code>traceId</code>.</li>
 *   <li>Invoca siempre <code>filterChain.doFilter(...)</code> para no cortar la cadena.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Petición al servidor
 * GET /api/reportes
 *
 * # Respuesta con cabecera personalizada
 * X-Trace-Id: 4bf92f3577b34da6a3ce929d0e0e4736
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Recupera el span con <code>tracer.currentSpan()</code>.</li>
 *   <li>Usa <code>response.setHeader("X-Trace-Id", span.context().traceId())</code>.</li>
 *   <li>Hazlo antes de <code>filterChain.doFilter(...)</code> o justo después, según tu preferencia.</li>
 * </ul>
 */
@Component
public class TraceFilterEnunciado extends OncePerRequestFilter {

    /**
     * Intercepta cada petición HTTP para inyectar el TraceID en la respuesta.
     *
     * @param request Petición HTTP entrante.
     * @param response Respuesta HTTP saliente donde se añadirá la cabecera.
     * @param filterChain Cadena de filtros de Spring.
     * @throws ServletException si ocurre un error en la cadena de filtros.
     * @throws IOException si ocurre un error de I/O.
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // TODO: Recupera el TraceID del span actual y añádelo
        // como cabecera "X-Trace-Id" en la respuesta.
        filterChain.doFilter(request, response);
    }
}
