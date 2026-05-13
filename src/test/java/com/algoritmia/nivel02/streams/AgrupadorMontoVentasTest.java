package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.streams.AgrupadorMontoVentasEnunciado.Venta;

class AgrupadorMontoVentasTest {

    @Test
    void testSumaPorMoneda() {
        List<Venta> ventas = List.of(
            new Venta(100.0, "USD"),
            new Venta(50.0, "EUR"),
            new Venta(200.0, "USD")
        );
        AgrupadorMontoVentasEnunciado agrupador = new AgrupadorMontoVentasEnunciado();
        Map<String, Double> resultado = agrupador.calcularTotalesPorMoneda(ventas);

        assertEquals(300.0, resultado.get("USD"));
        assertEquals(50.0, resultado.get("EUR"));
    }
}
