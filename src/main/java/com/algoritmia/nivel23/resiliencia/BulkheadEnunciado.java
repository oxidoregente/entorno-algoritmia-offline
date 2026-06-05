package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Compartimentación (Bulkhead).
 * <b>Dificultad: Difícil</b>
 *
 * <p>El patrón Bulkhead (literalmente "mamparo" de un barco) aísla recursos del
 * sistema —por ejemplo, hilos de un pool— para que si una operación pesada o
 * inestable colapsa, no se lleve consigo al resto de la aplicación. Es esencial
 * en microservicios que consumen APIs externas poco confiables.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Resilience4j ofrece dos tipos: <code>SEMAPHORE</code> (limita llamadas concurrentes en el mismo hilo) y <code>THREADPOOL</code> (aísla en un pool dedicado).</li>
 *   <li>Se aplica con <code>@Bulkhead</code> a nivel de método.</li>
 *   <li>Si el pool está saturado, Resilience4j lanza <code>BulkheadFullException</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * @Bulkhead(name = "servicioLento", type = Bulkhead.Type.THREADPOOL)
 * public String tareaPesada() { ... }
 *
 * # application.yml
 * resilience4j.bulkhead:
 *   instances:
 *     servicioLento:
 *       max-thread-pool-size: 10
 *       core-thread-pool-size: 5
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>@Bulkhead(name = "servicioLento", type = Bulkhead.Type.THREADPOOL)</code> sobre el método.</li>
 *   <li>Configura el pool en <code>application.yml</code> bajo <code>resilience4j.bulkhead.instances.servicioLento</code>.</li>
 * </ul>
 */
@Service
public class BulkheadEnunciado {

    /**
     * Simula una tarea pesada aislada en un pool de hilos dedicado para no agotar
     * el pool principal de la aplicación.
     *
     * @return Resultado ficticio de la operación pesada.
     */
    public String tareaPesada() {
        return "Resultado pesado";
    }
}
