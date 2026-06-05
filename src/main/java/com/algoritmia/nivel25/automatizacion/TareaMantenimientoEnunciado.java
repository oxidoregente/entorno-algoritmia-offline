package com.algoritmia.nivel25.automatizacion;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Tarea de Mantenimiento Programada.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En sistemas contables y financieros, un <b>cierre
 * contable</b> es un proceso batch (cálculo de balances,
 * agregaciones, generación de asientos) que se ejecuta de
 * forma masiva y periódica. Spring Batch es el framework
 * estándar para definir Jobs robustos con reintentos y
 * chunking, y Spring Scheduling permite dispararlos sin
 * intervención humana. Esta clase combina ambos: lanza un
 * {@link org.springframework.batch.core.Job} de cierre
 * contable cada 10 minutos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link org.springframework.batch.core.launch.JobLauncher} ejecuta Jobs y devuelve
 *       un {@code JobExecution} con su estado y métricas.</li>
 *   <li>Para identificar el Job se usa {@code @Qualifier} cuando hay varios beans
 *       de tipo {@link org.springframework.batch.core.Job}.</li>
 *   <li>El {@code JobLauncher} requiere un {@code JobParameters}; en
 *       {@code @Scheduled} suele bastar con la marca temporal actual para que cada
 *       ejecución sea única.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class TareaMantenimientoEnunciado {
 *     private final JobLauncher jobLauncher;
 *     private final Job jobCierreContable;
 *
 *     public TareaMantenimientoEnunciado(JobLauncher jobLauncher,
 *                                       &#64;Qualifier("jobCierre") Job jobCierreContable) {
 *         this.jobLauncher = jobLauncher;
 *         this.jobCierreContable = jobCierreContable;
 *     }
 *
 *     &#64;Scheduled(fixedRate = 600_000)
 *     public void ejecutarCierreMasivo() throws Exception {
 *         JobParameters params = new JobParametersBuilder()
 *                 .addLong("timestamp", System.currentTimeMillis())
 *                 .toJobParameters();
 *         jobLauncher.run(jobCierreContable, params);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Cada invocación de un Job necesita parámetros únicos; usa
 *       {@code System.currentTimeMillis()} como {@code "timestamp"}.</li>
 *   <li>Captura las excepciones y loguéelas: si el Job falla, no quieres que el
 *       programador se detenga para siempre.</li>
 * </ul>
 */
@Service
public class TareaMantenimientoEnunciado {

    private final JobLauncher jobLauncher;
    private final Job jobCierreContable;

    public TareaMantenimientoEnunciado(JobLauncher jobLauncher, @Qualifier("jobCierre") Job jobCierreContable) {
        this.jobLauncher = jobLauncher;
        this.jobCierreContable = jobCierreContable;
    }

    /**
     * Ejecuta el Job de cierre contable de forma periódica.
     * Se lanza automáticamente cada 10 minutos (600.000 ms).
     *
     * @throws Exception si la ejecución del Job falla al lanzarse
     */
    @Scheduled(fixedRate = 600000)
    public void ejecutarCierreMasivo() throws Exception {
        // TODO: Ejecutar el job usando jobLauncher.run()
    }
}
