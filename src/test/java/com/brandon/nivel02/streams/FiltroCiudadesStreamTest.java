package com.brandon.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.brandon.nivel02.streams.FiltroCiudadesStreamEnunciado.Ciudad;

class FiltroCiudadesStreamTest {

    @Test
    void testConteoCiudades() {
        List<Ciudad> ciudades = List.of(
            new Ciudad("Bogota", "Colombia"),
            new Ciudad("Medellin", "Colombia"),
            new Ciudad("Madrid", "España"),
            new Ciudad("Barcelona", "España"),
            new Ciudad("Sevilla", "España")
        );
        FiltroCiudadesStreamEnunciado solver = new FiltroCiudadesStreamEnunciado();

        Map<String, Long> resultado = solver.contarCiudadesPorPais(ciudades);

        // assertEquals(2L, resultado.get("Colombia"));
        // assertEquals(3L, resultado.get("España"));
    }
}
