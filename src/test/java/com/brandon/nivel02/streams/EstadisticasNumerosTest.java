package com.brandon.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.DoubleSummaryStatistics;
import org.junit.jupiter.api.Test;

class EstadisticasNumerosTest {

    @Test
    void testCalculoEstadistico() {
        List<Double> notas = List.of(10.0, 5.0, 8.0, 7.0);
        EstadisticasNumerosEnunciado stats = new EstadisticasNumerosEnunciado();

        DoubleSummaryStatistics resultado = stats.obtenerEstadisticas(notas);

        // assertEquals(5.0, resultado.getMin());
        // assertEquals(10.0, resultado.getMax());
        // assertEquals(7.5, resultado.getAverage());
    }
}
