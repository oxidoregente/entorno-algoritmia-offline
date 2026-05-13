package com.brandon.nivel23.resiliencia;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 🏆 SOLUCIÓN: Estrategia de Reintentos.
 */
public class ReintentadorServicioSolucion {

    private AtomicInteger intentos = new AtomicInteger(0);

    public String operacionConFallaTemporal() {
        if (intentos.incrementAndGet() < 3) {
            throw new RuntimeException("Falla temporal");
        }
        return "Éxito tras reintentos";
    }
}
