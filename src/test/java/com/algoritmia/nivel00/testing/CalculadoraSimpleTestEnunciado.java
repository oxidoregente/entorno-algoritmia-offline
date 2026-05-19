package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 🎓 RETO: Test Básico de Calculadora.
 * <b>Dificultad: Inicial</b>
 * 
 * <p>Escribe tu primer test unitario en JUnit 5. El objetivo es 
 * practicar el patrón Arrange-Act-Assert (AAA) con una 
 * suma simple de dos números enteros.</p>
 * 
 * <p><b>Instrucciones:</b>
 * <ol>
 *   <li>ARRANGE: Define los valores de entrada (2 y 2) y el resultado esperado (4).</li>
 *   <li>ACT: Llama a la lógica de suma.</li>
 *   <li>ASSERT: Usa {@code assertEquals} para verificar el resultado.</li>
 * </ol></p>
 */
class CalculadoraSimpleTestEnunciado {

	@Test
	void testSuma() {
		// TODO: Prueba que 2 + 2 sea 4 usando el patrón AAA

		int n1 = 2;
		int n2 = 2;

		CalculadoraSimpleSolucion calcular = new CalculadoraSimpleSolucion();

		assertEquals(4, calcular.sumar(n1, n2));
	}
}
