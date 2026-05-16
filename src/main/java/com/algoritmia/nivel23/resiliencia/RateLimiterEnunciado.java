package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Limitación de Tasa (Rate Limiter).
 * <b>Dificultad: Media</b>
 * 
 * <p>Evita que un cliente sature tu sistema limitando el número de 
 * peticiones por segundo que puede realizar.</p>
 */
@Service
public class RateLimiterEnunciado {

    /**
     * Limita este método a solo 5 llamadas por minuto.
     * <b>💡 Pista:</b> Usa @RateLimiter(name = "backendPublico") y 
     * configura las propiedades en application.properties.
     */
    @RateLimiter(name = "backendPublico")
    public String consultarRecurso() {
        return "Datos del recurso";
    }
}
