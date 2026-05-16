package com.algoritmia.nivel25.batch;

import org.springframework.batch.core.step.builder.SimpleStepBuilder;

/**
 * 🎓 RETO: Tolerancia a Fallos en Batch.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Los procesos Batch suelen manejar miles de registros. Si uno falla, 
 * no queremos que todo el Job se detenga. Aprendemos a saltar (skip) errores.</p>
 */
public class BatchRetryEnunciado {

    public void configurarTolerancia(SimpleStepBuilder<?, ?> stepBuilder) {
        // TODO: Configura el step para que haga un skip de Exception.class 
        // con un límite de 10 errores.
    }
}
