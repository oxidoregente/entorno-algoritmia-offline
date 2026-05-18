package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * RETO: Escribe el test más simple del laboratorio.
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
