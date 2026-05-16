package com.algoritmia.nivel15;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Métricas Personalizadas con Micrometer.
 * <b>Dificultad: Media</b>
 * 
 * <p>Actuator nos da métricas estándar (CPU, Memoria), pero a veces 
 * necesitamos medir eventos de negocio (ej: cuántos cafés se han vendido).</p>
 */
@Service
public class MetricsCustomEnunciado {

    private final MeterRegistry meterRegistry;

    public MetricsCustomEnunciado(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    public void registrarVenta() {
        // TODO: Incrementa un contador llamado "ventas.totales" 
        // usando el meterRegistry.
    }
}
