package com.brandon.nivel2.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.brandon.nivel2.streams.CalculadoraRecetas.Ingrediente;

class CalculadoraRecetasTest {

    @Test
    void testAjusteDeReceta() {
        // Arrange: Receta de Coffee Blondies simplificada
        List<Ingrediente> recetaOriginal = List.of(
            new Ingrediente("Mantequilla", 115.0),
            new Ingrediente("Azúcar Moreno", 200.0),
            new Ingrediente("Café Soluble", 5.0), // Será filtrado por ser < 10g
            new Ingrediente("Harina", 150.0),
            new Ingrediente("Sal", 2.0) // Será filtrado
        );
        CalculadoraRecetas calculadora = new CalculadoraRecetas();

        // Act: Duplicar la receta (multiplicador = 2)
        Map<String, Double> recetaAjustada = calculadora.ajustarReceta(recetaOriginal, 2.0);

        // Assert
        assertEquals(3, recetaAjustada.size(), "Deberían quedar solo 3 ingredientes significativos");
        assertTrue(recetaAjustada.containsKey("Mantequilla"));
        assertEquals(230.0, recetaAjustada.get("Mantequilla"), "La mantequilla debería duplicarse");
        assertFalse(recetaAjustada.containsKey("Café Soluble"), "El café soluble debería haber sido filtrado");
    }
}
