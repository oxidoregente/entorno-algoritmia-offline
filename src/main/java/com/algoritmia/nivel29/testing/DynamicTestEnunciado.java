package com.algoritmia.nivel29.testing;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;

/**
 * 🎓 RETO: Pruebas Dinámicas (TestFactory).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>A diferencia de los tests estáticos, los tests dinámicos se generan 
 * en tiempo de ejecución. Son útiles para probar flujos con datos 
 * que vienen de fuentes externas.</p>
 */
public class DynamicTestEnunciado {

    /**
     * Genera una serie de tests dinámicos.
     * <b>💡 Tarea:</b> Retorna un Stream de DynamicTest.
     */
    @TestFactory
    public Stream<DynamicTest> generarTestsDinamicos() {
        // TODO: Usa DynamicTest.dynamicTest(nombre, executable)
        return null;
    }
}
