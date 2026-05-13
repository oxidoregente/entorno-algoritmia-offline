package com.algoritmia.nivel01.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * 🎓 TUTORIAL DE TESTING - PARTE 1: El Patrón AAA
 * 
 * Bienvenidos al primer test del laboratorio. El objetivo de una prueba unitaria no es solo 
 * verificar que el código funciona, sino servir como documentación técnica.
 * 
 * En la industria, casi todos los desarrolladores seguimos el patrón AAA (Arrange, Act, Assert).
 * Vamos a desglosarlo con el reto de TwoSum.
 */
class TwoSumTest {

    @Test
    void testResolverTwoSum() {
        /*
         * 1️⃣ ARRANGE (Preparar / Escenario):
         * En esta fase configuramos todo lo necesario para la prueba.
         * Definimos las variables de entrada (inputs) y el resultado que esperamos obtener (output).
         */
        TwoSumEnunciado solver = new TwoSumEnunciado();
        int[] entrada = {2, 7, 11, 15};
        int objetivo = 9;
        int[] resultadoEsperado = {0, 1}; // Sabemos que 2 (índice 0) + 7 (índice 1) = 9.

        /*
         * 2️⃣ ACT (Actuar / Ejecutar):
         * Aquí ejecutamos el método real que estamos probando. 
         * Solo debería haber una línea de ejecución principal para mantener el test enfocado.
         */
        int[] resultadoReal = solver.resolver(entrada, objetivo);

        /*
         * 3️⃣ ASSERT (Afirmar / Verificar):
         * Aquí es donde sucede la "magia". Comparamos lo que obtuvimos (resultadoReal)
         * con lo que queríamos (resultadoEsperado).
         * 
         * JUnit nos provee métodos como:
         * - assertEquals(a, b): Para números, Strings u objetos simples.
         * - assertArrayEquals(a, b): Especial para arrays (verifica contenido y orden).
         * - assertTrue(condicion): Verifica que sea verdadero.
         */
        assertArrayEquals(resultadoEsperado, resultadoReal, 
            "El algoritmo debe devolver los índices exactos de los números que suman el objetivo.");
    }
}
