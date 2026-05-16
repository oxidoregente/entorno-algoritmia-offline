package com.algoritmia.nivel29.testing;

import org.junit.jupiter.api.DynamicTest;
import java.util.stream.Stream;

/**
 * 🏆 SOLUCIONES: JUnit 5 Avanzado.
 */
public class TestingExtraSoluciones {

    // Parametrized: @CsvSource({"1,1,2", "5,5,10"})
    // EnumSource: @EnumSource(Role.class)

    public Stream<DynamicTest> generarTestsDinamicos() {
        return Stream.of("A", "B", "C").map(input -> 
            DynamicTest.dynamicTest("Test para " + input, () -> {
                // Assertion
            })
        );
    }
}
