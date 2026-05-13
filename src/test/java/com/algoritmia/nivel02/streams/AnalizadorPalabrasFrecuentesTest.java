package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class AnalizadorPalabrasFrecuentesTest {

    @Test
    void testTop3Palabras() {
        String texto = "Java es genial, java es potente, java es el mejor lenguaje de programación";
        AnalizadorPalabrasFrecuentesEnunciado analizador = new AnalizadorPalabrasFrecuentesEnunciado();
        List<String> top = analizador.obtenerTop3Palabras(texto);
        
        // Java (3 veces), Es (3 veces), Genial/Potente... (1 vez)
        // assertEquals(3, top.size());
        // assertEquals("java", top.get(0));
    }
}
