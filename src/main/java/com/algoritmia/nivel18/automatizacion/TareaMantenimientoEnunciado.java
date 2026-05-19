package com.algoritmia.nivel18.automatizacion;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Tarea de Mantenimiento Programada.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Implementa una tarea programada que lance un Job de Spring Batch
 * ({@link org.springframework.batch.core.Job}) cada 10 minutos usando
 * {@link org.springframework.batch.core.launch.JobLauncher}.</p>
 *
 * <p>Esta tarea simula un cierre contable masivo ejecutado de forma
 * periódica sin intervención humana.</p>
 */
@Service
public class TareaMantenimientoEnunciado {

    private final JobLauncher jobLauncher;
    private final Job jobCierreContable;

    public TareaMantenimientoEnunciado(JobLauncher jobLauncher, @Qualifier("jobCierre") Job jobCierreContable) {
        this.jobLauncher = jobLauncher;
        this.jobCierreContable = jobCierreContable;
    }

    /**
     * Ejecuta el Job de cierre contable de forma periódica.
     * Se lanza automáticamente cada 10 minutos (600.000 ms).
     */
    @Scheduled(fixedRate = 600000)
    public void ejecutarCierreMasivo() {
        // TODO: Ejecutar el job usando jobLauncher.run()
    }
}
