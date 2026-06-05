package com.algoritmia.nivel29.actuator;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Métricas Personalizadas con Micrometer.
 * <b>Dificultad: Media</b>
 *
 * <p>Actuator expone métricas de infraestructura (JVM, CPU, memoria,
 * hilos, HTTP) a través de Micrometer, pero los eventos de negocio
 * (ventas realizadas, cafés servidos, errores de validación, etc.)
 * deben instrumentarse manualmente. Un {@link MeterRegistry} permite
 * crear contadores, temporizadores y gauges que luego se visualizan
 * en Prometheus, Datadog o cualquier backend compatible.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Inyectar el {@link MeterRegistry} (Spring Boot lo autoconfigura con Prometheus
 *       si la dependencia está presente).</li>
 *   <li>Usar {@code meterRegistry.counter("nombre.metric")} para incrementar contadores
 *       monotónicos de eventos.</li>
 *   <li>Los nombres siguen la convención {@code dominio.accion.unidad}, separada por
 *       puntos, para que Prometheus la convierta a snake_case.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class MetricsCustomEnunciado {
 *     private final MeterRegistry meterRegistry;
 *
 *     public MetricsCustomEnunciado(MeterRegistry meterRegistry) {
 *         this.meterRegistry = meterRegistry;
 *     }
 *
 *     public void registrarVenta() {
 *         meterRegistry.counter("ventas.totales").increment();
 *     }
 * }
 * // GET /actuator/metrics/ventas.totales =&gt; { "measurements": [{"statistic":"COUNT","value":42.0}] }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Si necesitas enriquecer el contador con etiquetas (tag = tipo de café), usa
 *       {@code Counter.builder("ventas.totales").tag("tipo", "espresso").register(meterRegistry)}.</li>
 *   <li>Recuerda exponer las métricas en
 *       {@code management.endpoints.web.exposure.include=metrics,prometheus}.</li>
 * </ul>
 */
@Service
public class MetricsCustomEnunciado {

    private final MeterRegistry meterRegistry;

    public MetricsCustomEnunciado(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    /**
     * Incrementa el contador de métricas para registrar una venta.
     */
    public void registrarVenta() {
        // TODO: Incrementa un contador llamado "ventas.totales"
        // usando el meterRegistry.
    }
}
