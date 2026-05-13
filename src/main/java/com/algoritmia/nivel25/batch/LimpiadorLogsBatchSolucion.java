package com.algoritmia.nivel25.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;

/**
 * 🏆 SOLUCIÓN: Job de Limpieza de Logs.
 */
public class LimpiadorLogsBatchSolucion {

    public Job jobLimpieza(JobRepository jobRepository, Step stepCierre) {
        return new JobBuilder("jobLimpiezaHistorico", jobRepository)
                .start(stepCierre)
                .build();
    }
}
