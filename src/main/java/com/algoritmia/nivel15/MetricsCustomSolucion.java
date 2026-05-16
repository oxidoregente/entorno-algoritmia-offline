package com.algoritmia.nivel15;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

/**
 * 🏆 SOLUCIÓN: Métricas Personalizadas con Micrometer.
 */
public class MetricsCustomSolucion {

    private final Counter ventasCounter;

    public MetricsCustomSolucion(MeterRegistry meterRegistry) {
        this.ventasCounter = Counter.builder("ventas.totales")
                .description("Número total de ventas")
                .register(meterRegistry);
    }

    public void registrarVenta() {
        ventasCounter.increment();
    }
}
