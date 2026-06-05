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
 * <p>Las tablas de logs de acceso crecen sin parar. Para evitar que degraden
 * el rendimiento de la base, se programa un Job Batch periódico que borra los
 * registros antiguos (por ejemplo, con más de 90 días). Un Job Spring Batch
 * está compuesto por un grafo de <b>Steps</b>, y se orquesta a partir de un
 * <code>JobRepository</code>.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Un <code>Job</code> se construye con <code>JobBuilder</code> + <code>JobRepository</code>.</li>
 *   <li>Cada Job contiene al menos un <code>Step</code> (<code>StepBuilder</code>).</li>
 *   <li>El primer step se indica con <code>.start(step)</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * return new JobBuilder("jobLimpiezaHistorico", jobRepository)
 *     .start(stepLimpieza)
 *     .build();
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Importa <code>org.springframework.batch.core.job.builder.JobBuilder</code> y <code>org.springframework.batch.core.step.builder.StepBuilder</code>.</li>
 *   <li>Encadena <code>.start(step)</code> y <code>.build()</code>.</li>
 * </ul>
 */
@Configuration
public class LimpiadorLogsBatchEnunciado {

    /**
     * Define el Job de Spring Batch responsable de orquestar la limpieza de logs antiguos.
     *
     * @param jobRepository Repositorio de metadatos del Job (necesario para registrar ejecuciones).
     * @return Bean de tipo <code>Job</code> con el flujo de limpieza configurado, o {@code null} si no está listo.
     */
    @Bean
    public Job jobLimpieza(JobRepository jobRepository) {
        // TODO: Construye un Job con nombre "jobLimpiezaHistorico" que inicie con un Step (simulado)
        return null;
    }
}
