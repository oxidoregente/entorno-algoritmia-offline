package com.brandon.nivel18.automatizacion;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Nivel 18/25: Automatización y Procesamiento por Lotes.
 */
@Service
public class TareaMantenimiento {

    private static final Logger logger = LoggerFactory.getLogger(TareaMantenimiento.class);
    private final JobLauncher jobLauncher;
    private final Job jobCierreContable;

    public TareaMantenimiento(JobLauncher jobLauncher, Job jobCierreContable) {
        this.jobLauncher = jobLauncher;
        this.jobCierreContable = jobCierreContable;
    }

    /**
     * Dispara el proceso masivo de Spring Batch cada 10 minutos.
     */
    @Scheduled(fixedRate = 600000) 
    public void ejecutarCierreMasivo() {
        try {
            logger.info(">> [AUTOMATIZACIÓN] Iniciando Job de Spring Batch - {}", LocalDateTime.now());
            JobParameters params = new JobParametersBuilder()
                    .addString("idEjecucion", String.valueOf(System.currentTimeMillis()))
                    .toJobParameters();
            jobLauncher.run(jobCierreContable, params);
        } catch (Exception e) {
            logger.error("Error al ejecutar el lote: {}", e.getMessage());
        }
    }
...
    /**
     * Tarea de reporte de salud que se ejecuta cada hora usando expresión Cron.
     * Estructura: "segundos minutos horas día mes día-semana"
     */
    @Scheduled(cron = "0 0 * * * *")
    public void generarReporteSalud() {
        logger.info(">> [CRON] Generando reporte horario de salud del sistema...");
    }
}
