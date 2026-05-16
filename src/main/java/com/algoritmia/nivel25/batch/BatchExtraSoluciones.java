package com.algoritmia.nivel25.batch;

import org.springframework.batch.core.step.builder.SimpleStepBuilder;

/**
 * 🏆 SOLUCIONES: ItemProcessor y Skip Logic.
 */
public class BatchExtraSoluciones {

    public String process(String item) {
        if (item == null || item.isBlank()) return null;
        return item.trim().toUpperCase();
    }

    public void configurarTolerancia(SimpleStepBuilder<?, ?> stepBuilder) {
        stepBuilder.faultTolerant()
                .skip(Exception.class)
                .skipLimit(10);
    }
}
