package com.brandon.nivel25.batch;

import com.brandon.nivel4.repositorios.TransaccionEnunciado;
import com.brandon.nivel4.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.data.builder.RepositoryItemReaderBuilder;
import org.springframework.batch.item.data.builder.RepositoryItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Map;

/**
 * Nivel 25: Spring Batch - Procesamiento Masivo.
 * 
 * Simula un cierre contable que procesa transacciones en bloques (chunks).
 */
@Configuration
public class LoteCierreContableConfig {

    @Bean
    public RepositoryItemReader<TransaccionEnunciado> reader(TransaccionRepositoryEnunciado repository) {
        return new RepositoryItemReaderBuilder<TransaccionEnunciado>()
                .repository(repository)
                .methodName("findAll")
                .sorts(Map.of("id", Sort.Direction.ASC))
                .name("transaccionReader")
                .build();
    }

    @Bean
    public ItemProcessor<TransaccionEnunciado, TransaccionEnunciado> processor() {
        return transaccion -> {
            System.out.println(">> [BATCH] Procesando transacción masiva ID: " + transaccion.getId());
            transaccion.setEstado("ARCHIVADA_BATCH");
            return transaccion;
        };
    }

    @Bean
    public RepositoryItemWriter<TransaccionEnunciado> writer(TransaccionRepositoryEnunciado repository) {
        return new RepositoryItemWriterBuilder<TransaccionEnunciado>()
                .repository(repository)
                .methodName("save")
                .build();
    }

    @Bean
    public Step stepCierre(JobRepository jobRepository, PlatformTransactionManager transactionManager,
                           RepositoryItemReader<TransaccionEnunciado> reader,
                           ItemProcessor<TransaccionEnunciado, TransaccionEnunciado> processor,
                           RepositoryItemWriter<TransaccionEnunciado> writer) {
        return new StepBuilder("stepCierre", jobRepository)
                .<TransaccionEnunciado, TransaccionEnunciado>chunk(10, transactionManager)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Job jobCierre(JobRepository jobRepository, Step stepCierre) {
        return new JobBuilder("jobCierreContable", jobRepository)
                .start(stepCierre)
                .build();
    }
}
