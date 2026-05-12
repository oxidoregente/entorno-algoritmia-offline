package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.AgrupadorJerarquicoEnunciado.Transaccion;

class AgrupadorJerarquicoTest {

    @Test
    void testAgrupamientoDoble() {
        List<Transaccion> datos = List.of(
            new Transaccion(2024, "Enero", 100),
            new Transaccion(2024, "Febrero", 200),
            new Transaccion(2023, "Enero", 50)
        );
        AgrupadorJerarquicoEnunciado solver = new AgrupadorJerarquicoEnunciado();

        Map<Integer, Map<String, List<Transaccion>>> resultado = solver.agrupar(datos);

        // assertNotNull(resultado);
        // assertEquals(2, resultado.size()); // 2023 y 2024
    }
}
