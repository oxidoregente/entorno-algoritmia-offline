package com.algoritmia.nivel25.batch;

import com.algoritmia.nivel04.repositorios.LogAccesoEnunciado;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * 🎓 RETO: Job de Limpieza de Logs.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa la orquestación de un Job que se encargue de limpiar logs antiguos.</p>
 */
@Configuration
public class LimpiadorLogsBatchEnunciado {

    @Bean
    public Job jobLimpieza(JobRepository jobRepository, Step stepStub) {
        // TODO: Construye un Job con nombre "jobLimpiezaHistorico" que inicie con un Step (simulado)
        return new JobBuilder("jobLimpiezaHistorico", jobRepository)
                .start(stepStub)
                .build();
    }

    @Bean
    public Step stepStub(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("stepStub", jobRepository)
                .tasklet((contribution, chunkContext) -> null, transactionManager)
                .build();
    }
}
