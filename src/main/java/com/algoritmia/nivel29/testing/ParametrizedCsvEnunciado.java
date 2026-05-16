package com.algoritmia.nivel29.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 🎓 RETO: Pruebas Parametrizadas con CSV.
 * <b>Dificultad: Media</b>
 * 
 * <p>Aprende a ejecutar el mismo test con múltiples conjuntos de datos 
 * definidos en formato CSV.</p>
 */
public class ParametrizedCsvEnunciado {

    /**
     * Prueba la suma de dos números.
     * <b>💡 Tarea:</b> Usa @CsvSource para probar: (1,1,2), (5,5,10), (10,-2,8).
     */
    public void testSuma(int a, int b, int esperado) {
        // Assertions.assertEquals(esperado, a + b);
    }
}
