package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

/**
 * 🎓 RETO: Circuit Breaker Manual.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Aunque @CircuitBreaker es cómodo, a veces necesitamos controlar el 
 * estado del circuito programáticamente desde el código.</p>
 */
@Service
public class CircuitBreakerManualEnunciado {

    private final CircuitBreaker circuitBreaker;

    public CircuitBreakerManualEnunciado(CircuitBreakerRegistry registry) {
        this.circuitBreaker = registry.circuitBreaker("manualCB");
    }

    public String ejecutarConControl(Supplier<String> operacion) {
        // TODO: Usa circuitBreaker.executeSupplier(operacion) para envolver la llamada.
        return null;
    }
}
