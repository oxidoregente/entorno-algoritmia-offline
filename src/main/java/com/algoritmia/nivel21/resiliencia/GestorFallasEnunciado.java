package com.algoritmia.nivel21.resiliencia;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import java.util.function.Supplier;

/**
 * 🎓 RETO: Implementación de Circuit Breaker.
 * <b>Dificultad: Media</b>
 *
 * <p>Imagina una pasarela de pagos: si el proveedor externo está caído, no
 * queremos que cada petición quede colgada. El Circuit Breaker detecta el
 * umbral de fallos, abre el circuito y redirige las llamadas a un método de
 * fallback, manteniendo al usuario atendido con un mensaje alternativo.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><code>@CircuitBreaker(name = "...", fallbackMethod = "...")</code> protege el método.</li>
 *   <li>El método de fallback debe tener la misma firma + un parámetro final <code>Throwable</code>.</li>
 *   <li>Configura el umbral de fallos y tiempo de espera en <code>application.yml</code> bajo <code>resilience4j.circuitbreaker.instances</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # application.yml
 * resilience4j.circuitbreaker:
 *   instances:
 *     servicioExterno:
 *       slidingWindowSize: 10
 *       failureRateThreshold: 50
 *       waitDurationInOpenState: 10s
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para ejecutar el <code>Supplier</code> recibido, simplemente llama a <code>operacion.get()</code>.</li>
 *   <li>El fallback debe devolver un valor "seguro" como <code>"Respuesta de Emergencia"</code>.</li>
 * </ul>
 */
@Service
public class GestorFallasEnunciado {

    /**
     * Protege la ejecución de una operación inestable con un circuit breaker.
     *
     * @param operacion Lógica a ejecutar; si falla el circuit breaker la redirige al fallback.
     * @return Resultado de la operación, o valor del fallback si el circuito está abierto o se produce un error.
     */
    @CircuitBreaker(name = "servicioExterno", fallbackMethod = "metodoDeRespaldo")
    public String llamarServicioInestable(Supplier<String> operacion) {
        // TODO: Ejecuta la operación recibida
        return null;
    }

    /**
     * Método de respaldo invocado cuando el circuit breaker se abre o la operación lanza una excepción.
     *
     * @param operacion Operación original que se intentó ejecutar.
     * @param t Excepción capturada que provocó la activación del fallback.
     * @return Valor alternativo de respuesta para mantener al usuario atendido.
     */
    public String metodoDeRespaldo(Supplier<String> operacion, Throwable t) {
        // TODO: Devuelve "Respuesta de Emergencia"
        return null;
    }
}
