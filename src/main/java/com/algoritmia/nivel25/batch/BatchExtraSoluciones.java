package com.algoritmia.nivel25.batch;

import org.springframework.batch.core.step.builder.SimpleStepBuilder;

/**
 * SOLUCIÓN: ItemProcessor y Skip Logic de Spring Batch.
 * 
 * <p>Implementa un {@code ItemProcessor} que transforma cadenas a
 * mayúsculas, y una configuración de tolerancia a fallos con
 * {@code faultTolerant().skip()}.</p>
 */
public class BatchExtraSoluciones {

    /**
     * Procesa un item: recorta espacios en blanco y convierte a mayúsculas.
     *
     * @param item el item a procesar
     * @return el item transformado, o {@code null} si es nulo o está vacío
     */
    public String process(String item) {
        if (item == null || item.isBlank()) return null;
        return item.trim().toUpperCase();
    }

    /**
     * Configura tolerancia a fallos en un paso de Spring Batch.
     * Salta cualquier excepción hasta un límite de 10 fallos.
     *
     * @param stepBuilder el constructor del paso a configurar
     */
    public void configurarTolerancia(SimpleStepBuilder<?, ?> stepBuilder) {
        stepBuilder.faultTolerant()
                .skip(Exception.class)
                .skipLimit(10);
    }
}
