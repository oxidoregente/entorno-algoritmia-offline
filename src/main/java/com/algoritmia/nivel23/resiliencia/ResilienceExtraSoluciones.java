package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import java.util.function.Supplier;

/**
 * 🏆 SOLUCIONES: Resilience4j (RateLimiter, Bulkhead, Manual CB).
 */
public class ResilienceExtraSoluciones {

    // Rate Limiter
    /*
    @RateLimiter(name = "backendPublico")
    public String consultarRecurso() { ... }
    */

    // Bulkhead
    /*
    @Bulkhead(name = "servicioLento", type = Bulkhead.Type.THREADPOOL)
    public String tareaPesada() { ... }
    */

    // Manual CB
    public String ejecutarConControl(CircuitBreaker cb, Supplier<String> operacion) {
        return cb.executeSupplier(operacion);
    }
}
