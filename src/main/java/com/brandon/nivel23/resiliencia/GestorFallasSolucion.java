package com.brandon.nivel23.resiliencia;

import java.util.function.Supplier;

/**
 * 🏆 SOLUCIÓN: Implementación de Circuit Breaker.
 */
public class GestorFallasSolucion {

    public String llamarServicioInestable(Supplier<String> operacion) {
        return operacion.get();
    }

    public String metodoDeRespaldo(Supplier<String> operacion, Throwable t) {
        return "Respuesta de Emergencia";
    }
}
