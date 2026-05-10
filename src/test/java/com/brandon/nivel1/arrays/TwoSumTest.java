package com.brandon.nivel1.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * Test para validar la lógica de TwoSum.
 * Este test sirve como ejemplo pedagógico para entender el testing unitario.
 */
class TwoSumTest {

    @Test
    void testResolverTwoSum() {
        // --- 1. ARRANGE (Preparar) ---
        // Aquí configuramos el escenario. Definimos los datos de entrada
        // y el objeto que queremos probar.
        TwoSum solver = new TwoSum();
        int[] entrada = {2, 7, 11, 15};
        int objetivo = 9;
        int[] resultadoEsperado = {0, 1}; // 2 + 7 = 9

        // --- 2. ACT (Actuar) ---
        // Aquí ejecutamos la acción que queremos probar. 
        // Invocamos el método del código real.
        int[] resultadoReal = solver.resolver(entrada, objetivo);

        // --- 3. ASSERT (Afirmar/Verificar) ---
        // Aquí comparamos si el resultado real es igual al esperado.
        // Si no coinciden, el test fallará y nos avisará del error.
        assertArrayEquals(resultadoEsperado, resultadoReal, "Los índices deben sumar el objetivo correctamente");
    }
}
