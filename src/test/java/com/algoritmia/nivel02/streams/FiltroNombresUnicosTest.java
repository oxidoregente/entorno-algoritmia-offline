package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class FiltroNombresUnicosTest {

    @Test
    void testFormateoNombres() {
        FiltroNombresUnicosEnunciado filtro = new FiltroNombresUnicosEnunciado();
        List<String> entrada = List.of("brandon", "ana", "brandon", "carlos");
        List<String> resultado = filtro.formatearNombres(entrada);
        
        assertEquals(3, resultado.size());
        assertEquals("Ana", resultado.get(0));
        assertEquals("Carlos", resultado.get(1));
        assertEquals("Carlos", resultado.get(2));
    }
}
