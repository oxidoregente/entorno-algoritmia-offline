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
 * 🎓 RETO: Lote de Cierre Contable (Spring Batch).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Spring Batch es un framework para el procesamiento por lotes (Batch processing). 
 * Es ideal para tareas que manejan volúmenes masivos de datos sin intervención 
 * humana (ej: generar reportes mensuales, procesar miles de transacciones).</p>
 * 
 * <p><b>💡 Conceptos Clave:</b></p>
 * <ul>
 *   <li><b>Job:</b> El proceso completo (ej: "Cierre Contable").</li>
 *   <li><b>Step:</b> Una fase del Job. Un Job puede tener varios pasos.</li>
 *   <li><b>Chunk:</b> Indica cuántos registros se procesan juntos antes de hacer commit en la DB.</li>
 *   <li><b>Reader-Processor-Writer:</b> El patrón estándar para cada paso.</li>
 * </ul>
 * 
 * <p><b>Tarea:</b> Implementa el procesamiento masivo de transacciones. Debes 
 * leer todas las transacciones de la DB, cambiar su estado a "PROCESADO_POR_LOTE" 
 * y guardarlas de vuelta en grupos de 10.</p>
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
