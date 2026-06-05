package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

/**
 * 🎓 RETO: Circuit Breaker Manual.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Aunque la anotación <code>@CircuitBreaker</code> es la forma más cómoda de
 * aplicar el patrón, hay escenarios donde necesitas control fino: instrumentar
 * eventos, decidir la política en runtime, o exponer el <code>CircuitBreaker</code>
 * desde un bean reutilizable. La API programática de Resilience4j lo permite.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Un <code>CircuitBreaker</code> se obtiene a partir de un <code>CircuitBreakerRegistry</code>.</li>
 *   <li>Estados posibles: <code>CLOSED</code>, <code>OPEN</code> y <code>HALF_OPEN</code>.</li>
 *   <li><code>executeSupplier(...)</code> envuelve la llamada y aplica la lógica de cortocircuito.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Supplier&lt;String&gt; op = () -&gt; clienteHttp.getData();
 * return circuitBreaker.executeSupplier(op);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Llama directamente a <code>circuitBreaker.executeSupplier(operacion)</code>.</li>
 *   <li>Si el circuito está abierto se lanzará <code>CallNotPermittedException</code>.</li>
 * </ul>
 */
@Service
public class CircuitBreakerManualEnunciado {

    private final CircuitBreaker circuitBreaker;

    public CircuitBreakerManualEnunciado(CircuitBreakerRegistry registry) {
        this.circuitBreaker = registry.circuitBreaker("manualCB");
    }

    /**
     * Ejecuta la operación recibida protegida por el circuit breaker configurado manualmente.
     *
     * @param operacion Lógica a proteger; se invocará sólo si el circuito está cerrado o en half-open.
     * @return Resultado de la operación, o {@code null} si la implementación no está lista.
     * @throws io.github.resilience4j.circuitbreaker.CallNotPermittedException si el circuito está abierto.
     */
    public String ejecutarConControl(Supplier<String> operacion) {
        // TODO: Usa circuitBreaker.executeSupplier(operacion) para envolver la llamada.
        return null;
    }
}
