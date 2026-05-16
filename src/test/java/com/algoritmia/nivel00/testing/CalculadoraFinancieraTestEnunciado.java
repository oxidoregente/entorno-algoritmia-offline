package com.algoritmia.nivel00.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * 🎓 RETO: Testing Inverso. <b>Dificultad: Inicial</b>
 * 
 * <p>
 * En el mundo real, a veces heredas código que ya funciona pero no tiene
 * pruebas. Tu misión aquí es aprender a ESCRIBIR EL TEST para un código
 * existente.
 * </p>
 * 
 * <p>
 * <b>Instrucciones:</b> 1. NO modifiques 'CalculadoraFinancieraSolucion'. 2.
 * Implementa este test para verificar que el cálculo de interés compuesto sea
 * correcto. 3. Usa el patrón Arrange-Act-Assert (AAA).
 * </p>
 */
class CalculadoraFinancieraTestEnunciado {

	@Test
	void testCalcularInteresCompuesto() {
		// --- 1️⃣ ARRANGE (Preparar) ---
		// Instancia 'CalculadoraFinancieraSolucion'.
		// Define un capital de 1000.0, una tasa de 0.05 (5%) y 2 años.
		// El resultado esperado es 1102.5.

		// TODO: Define tus variables aquí

		CalculadoraFinancieraSolucion calcular = new CalculadoraFinancieraSolucion();
		double capital = 1000;
		double tasa = 0.05;
		int años = 2;

		// --- 2️⃣ ACT (Actuar) ---
		// Llama al método 'calcularInteresCompuesto' de la clase SOLUCIÓN.

		double resultado = calcular.calcularInteresCompuesto(capital, tasa, años);

		// TODO: Ejecuta la lógica

		// --- 3️⃣ ASSERT (Afirmar) ---
		// Compara el resultado con assertEquals.
		
		assertEquals(1102.5, resultado);

		// TODO: Verifica el resultado
	}
}
