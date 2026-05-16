package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import java.time.Instant;

/**
 * 🏆 SOLUCIONES: Scheduler Avanzado.
 */
public class SchedulerExtraSoluciones {

    // Fixed Delay
    @Scheduled(fixedDelay = 5000)
    public void tareaSecuencial() {}

    // TaskScheduler
    /*
    public void programarTarea(Runnable tarea, Instant momento) {
        taskScheduler.schedule(tarea, momento);
    }
    */
}
