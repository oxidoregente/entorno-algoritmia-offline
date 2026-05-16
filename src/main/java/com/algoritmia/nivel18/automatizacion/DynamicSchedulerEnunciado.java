package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;
import java.time.Instant;

/**
 * 🎓 RETO: Programación Dinámica con TaskScheduler.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>A veces no sabemos de antemano cuándo debe ejecutarse una tarea 
 * (ej: un usuario programa un recordatorio). En estos casos, usamos 
 * {@link TaskScheduler}.</p>
 */
@Component
public class DynamicSchedulerEnunciado {

    private final TaskScheduler taskScheduler;

    public DynamicSchedulerEnunciado(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    public void programarTarea(Runnable tarea, Instant momento) {
        // TODO: Usa el taskScheduler para programar la tarea en el momento indicado.
    }
}
