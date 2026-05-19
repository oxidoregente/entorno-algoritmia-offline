package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.algoritmia.nivel02.streams.AgrupadorRangosEdadEnunciado.Persona;

/**
 * Test para Agrupador por Rangos de Edad.
 * Valida groupingBy con categorías JOVEN/ADULTO/SENIOR.
 */
class AgrupadorRangosEdadTest {

    @Test
    void testAgrupamientoPorRangos() {
        List<Persona> personas = List.of(
            new Persona("Leo", 10),
            new Persona("UsuarioPrueba", 25),
            new Persona("Marta", 70)
        );
        AgrupadorRangosEdadEnunciado solver = new AgrupadorRangosEdadEnunciado();

        Map<String, List<String>> resultado = solver.agruparPorRangos(personas);

        assertTrue(resultado.get("JOVEN").contains("Leo"));
        assertTrue(resultado.get("ADULTO").contains("UsuarioPrueba"));
        assertTrue(resultado.get("SENIOR").contains("Marta"));
    }
}
