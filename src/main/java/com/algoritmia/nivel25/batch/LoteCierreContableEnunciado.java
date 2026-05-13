package com.algoritmia.nivel25.batch;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
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
 * RETO: Lote de Cierre Contable.
 * 
 * Implementa un Job de procesamiento masivo.
 * El estudiante debe definir el Step y el Job vinculando los componentes.
 */
@Configuration
public class LoteCierreContableEnunciado {

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
        // TODO: Transformar el estado a "PROCESADO_POR_LOTE"
        return null;
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
        // TODO: Construir el step usando StepBuilder con chunks de 10
        return null;
    }

    @Bean
    public Job jobCierre(JobRepository jobRepository, Step stepCierre) {
        // TODO: Construir el job usando JobBuilder
        return null;
    }
}
