package com.brandon.nivel23.resiliencia;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

/**
 * 🎓 RETO: Implementación de Circuit Breaker.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que proteja una operación inestable. 
 * Si la operación falla, el disyuntor debe abrirse y ejecutar el método de fallback.</p>
 */
@Service
public class GestorFallasEnunciado {

    @CircuitBreaker(name = "servicioExterno", fallbackMethod = "metodoDeRespaldo")
    public String llamarServicioInestable(Supplier<String> operacion) {
        // TODO: Ejecuta la operación recibida
        return null;
    }

    public String metodoDeRespaldo(Supplier<String> operacion, Throwable t) {
        // TODO: Devuelve "Respuesta de Emergencia"
        return null;
    }
}
