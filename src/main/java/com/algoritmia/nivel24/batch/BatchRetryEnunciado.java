package com.algoritmia.nivel24.batch;

import org.springframework.batch.core.step.builder.SimpleStepBuilder;

/**
 * 🎓 RETO: Tolerancia a Fallos en Batch.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Un Job Batch puede procesar millones de registros. Si el reader, processor
 * o writer lanza una excepción en uno de ellos, el comportamiento por defecto
 * es abortar el Job entero. En la práctica es preferible configurar políticas
 * de <b>skip</b> (ignorar el item) o <b>retry</b> (reintentar) para que un
 * registro problemático no arruine el procesamiento de los demás.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li><code>.faultTolerant().skip(Exception.class).skipLimit(10)</code> permite saltar hasta 10 excepciones.</li>
 *   <li>También existe <code>.retry(Exception.class).retryLimit(3)</code> para reintentos.</li>
 *   <li>Configurar <code>skipPolicy</code> personalizada para lógica más fina.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stepBuilder.&lt;String, String&gt;chunk(100)
 *     .reader(...)
 *     .processor(...)
 *     .writer(...)
 *     .faultTolerant()
 *     .skip(Exception.class)
 *     .skipLimit(10);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Llama a <code>stepBuilder.faultTolerant()</code> para activar el modo tolerante.</li>
 *   <li>Encadena <code>.skip(Exception.class).skipLimit(10)</code>.</li>
 * </ul>
 */
public class BatchRetryEnunciado {

    /**
     * Configura un step para que tolere hasta 10 errores de cualquier tipo sin abortar el Job.
     *
     * @param stepBuilder Builder del step al que se le aplicará la política de tolerancia.
     */
    public void configurarTolerancia(SimpleStepBuilder<?, ?> stepBuilder) {
        // TODO: Configura el step para que haga un skip de Exception.class
        // con un límite de 10 errores.
    }
}
