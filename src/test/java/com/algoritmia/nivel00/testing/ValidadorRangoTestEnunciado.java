package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 🎓 RETO: Test del Validador de Rangos.
 * <b>Dificultad: Inicial</b>
 * 
 * <p>Escribe tests para un validador que verifica si un número 
 * está dentro de un rango inclusivo [min, max]. Practica el uso 
 * de {@code assertTrue} y {@code assertFalse}.</p>
 * 
 * <p><b>Instrucciones:</b>
 * <ol>
 *   <li>ARRANGE: Instancia {@code ValidadorRangoSolucion}.</li>
 *   <li>ACT: Prueba casos dentro y fuera del rango.</li>
 *   <li>ASSERT: Usa {@code assertTrue} para casos válidos y 
 *       {@code assertFalse} para inválidos.</li>
 * </ol></p>
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
