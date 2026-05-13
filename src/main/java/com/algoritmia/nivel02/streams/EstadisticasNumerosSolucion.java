package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.DoubleSummaryStatistics;

/**
 * SOLUCIÓN: Estadísticas de Números.
 */
public class EstadisticasNumerosSolucion {

    public DoubleSummaryStatistics obtenerEstadisticas(List<Double> numeros) {
        return numeros.stream()
                .mapToDouble(Double::doubleValue)
                .summaryStatistics();
    }
}
