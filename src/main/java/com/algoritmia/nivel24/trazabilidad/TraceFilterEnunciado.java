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
 * <p>Aprende a capturar el TraceID de la petición entrante y añadirlo 
 * a la cabecera de respuesta para facilitar el debugging al cliente.</p>
 */
@Component
public class TraceFilterEnunciado extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        // TODO: Recupera el TraceID del span actual y añádelo 
        // como cabecera "X-Trace-Id" en la respuesta.
        filterChain.doFilter(request, response);
    }
}
