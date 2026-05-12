package com.brandon.nivel29.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 🎓 TUTORIAL DE TESTING - PARTE 3: Pruebas Parametrizadas
 * 
 * A veces queremos probar un método con muchos datos diferentes. En lugar de escribir
 * 10 métodos @Test, usamos @ParameterizedTest.
 */
class ValidadorEdadTest {

    /*
     * 🧪 ¿Qué es @ParameterizedTest?
     * Permite ejecutar el mismo test varias veces con diferentes argumentos.
     * @CsvSource nos permite pasar una lista de valores: {entrada, resultado_esperado}
     */
    @ParameterizedTest
    @CsvSource({
        "18, true",
        "25, true",
        "17, false",
        "0, false",
        "100, true"
    })
    void testEdades(int edad, boolean resultadoEsperado) {
        ValidadorEdadEnunciado validador = new ValidadorEdadEnunciado();
        
        boolean resultadoReal = validador.esMayorDeEdad(edad);
        
        assertEquals(resultadoEsperado, resultadoReal, 
            "Para la edad " + edad + " el resultado debería ser " + resultadoEsperado);
    }
}
