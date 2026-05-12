package com.brandon.nivel18.automatizacion;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

/**
 * SOLUCIÓN: Tarea de Mantenimiento Programada.
 */
public class TareaMantenimientoSolucion {

    private final JobLauncher jobLauncher;
    private final Job jobCierreContable;

    public TareaMantenimientoSolucion(JobLauncher jobLauncher, Job jobCierreContable) {
        this.jobLauncher = jobLauncher;
        this.jobCierreContable = jobCierreContable;
    }

    public void ejecutarCierreMasivo() throws Exception {
        JobParameters params = new JobParametersBuilder()
                .addString("idEjecucion", String.valueOf(System.currentTimeMillis()))
                .toJobParameters();
        jobLauncher.run(jobCierreContable, params);
    }
}
