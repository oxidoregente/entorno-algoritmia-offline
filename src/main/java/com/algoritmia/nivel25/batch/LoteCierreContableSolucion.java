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
 * SOLUCIÓN: Lote de Cierre Contable.
 */

public class LoteCierreContableSolucion {

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
        return t -> {
            t.setEstado("PROCESADO_POR_LOTE");
            return t;
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
