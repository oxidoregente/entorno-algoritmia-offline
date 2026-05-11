package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.CalculadoraRecetasEnunciado.Ingrediente;

class CalculadoraRecetasTest {

    @Test
    void testAjusteDeReceta() {
        List<Ingrediente> recetaOriginal = List.of(
            new Ingrediente("Mantequilla", 115.0),
            new Ingrediente("Café Soluble", 5.0),
            new Ingrediente("Harina", 150.0)
        );
        CalculadoraRecetasEnunciado calculadora = new CalculadoraRecetasEnunciado();

        Map<String, Double> recetaAjustada = calculadora.ajustarReceta(recetaOriginal, 2.0);

        assertEquals(2, recetaAjustada.size());
        assertEquals(230.0, recetaAjustada.get("Mantequilla"));
        assertFalse(recetaAjustada.containsKey("Café Soluble"));
    }
}
