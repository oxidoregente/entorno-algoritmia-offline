package com.algoritmia.nivel25.batch;

import com.algoritmia.nivel04.repositorios.LogAccesoEnunciado;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 🎓 RETO: Job de Limpieza de Logs.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa la orquestación de un Job que se encargue de limpiar logs antiguos.</p>
 */
@Configuration
public class LimpiadorLogsBatchEnunciado {

    @Bean
    public Job jobLimpieza(JobRepository jobRepository) {
        // TODO: Construye un Job con nombre "jobLimpiezaHistorico" que inicie con un Step (simulado)
        return null;
    }
}
