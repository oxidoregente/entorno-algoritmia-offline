package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.streams.EstadisticasVentasEnunciado.Venta;

class EstadisticasVentasTest {

    @Test
    void testCalculoTotales() {
        List<Venta> ventas = List.of(
            new Venta("Electrónica", 1000.0),
            new Venta("Hogar", 50.0),
            new Venta("Electrónica", 500.0)
        );
        EstadisticasVentasEnunciado stats = new EstadisticasVentasEnunciado();

        Map<String, Double> totales = stats.calcularTotalesPorCategoria(ventas);

        assertEquals(1500.0, totales.get("Electrónica"));
        assertEquals(50.0, totales.get("Hogar"));
    }
}
