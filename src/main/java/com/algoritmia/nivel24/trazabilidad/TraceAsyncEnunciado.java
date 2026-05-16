package com.algoritmia.nivel24.trazabilidad;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Propagación de Trazas en Hilos Asíncronos.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Por defecto, las trazas no se propagan a hilos nuevos (como los 
 * creados por @Async). Debes configurar un decorador de hilos.</p>
 */
@Service
public class TraceAsyncEnunciado {

    @Async
    public void tareaAsincrona() {
        // TODO: Verifica que el TraceID en este hilo sea el mismo 
        // que el del hilo que llamó a este método.
    }
}
