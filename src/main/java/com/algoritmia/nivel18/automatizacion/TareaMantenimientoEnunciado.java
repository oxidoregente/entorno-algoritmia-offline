package com.algoritmia.nivel18.automatizacion;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * RETO: Tarea de Mantenimiento Programada.
 */
@Service
public class TareaMantenimientoEnunciado {

    private final JobLauncher jobLauncher;
    private final Job jobCierreContable;

    public TareaMantenimientoEnunciado(JobLauncher jobLauncher, @Qualifier("jobCierre") Job jobCierreContable) {
        this.jobLauncher = jobLauncher;
        this.jobCierreContable = jobCierreContable;
    }

    @Scheduled(fixedRate = 600000) 
    public void ejecutarCierreMasivo() {
        // TODO: Ejecutar el job usando jobLauncher.run()
    }
}
