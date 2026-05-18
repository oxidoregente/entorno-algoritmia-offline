package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * RETO: Escribe el test para el Validador de Rangos.
 */
class ValidadorRangoTestEnunciado {

	@Test
	void testRangoInclusivo() {
		// --- 1️⃣ ARRANGE ---
		// Instancia 'ValidadorRangoSolucion'.
		int min = 0;
		int max = 10;
		int num = 4;
		ValidadorRangoSolucion validador = new ValidadorRangoSolucion();

		// --- 2️⃣ ACT ---
		// Prueba un caso de éxito (ej: 5 está entre 1 y 10).

		boolean resultado = validador.estaEnRango(num, min, max);
		
		// --- 3️⃣ ASSERT ---
		// Usa assertTrue o assertFalse.
		// TODO: Implementa el test
		assertEquals(true, resultado);
	}
}
