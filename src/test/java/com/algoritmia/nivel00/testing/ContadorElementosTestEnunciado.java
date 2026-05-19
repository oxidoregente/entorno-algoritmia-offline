package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 🎓 RETO: Test del Contador de Elementos.
 * <b>Dificultad: Inicial</b>
 * 
 * <p>Escribe tests para un contador que cuenta elementos no nulos 
 * en una lista. El objetivo es practicar la verificación de 
 * colecciones y el manejo de valores {@code null}.</p>
 * 
 * <p><b>Instrucciones:</b>
 * <ol>
 *   <li>ARRANGE: Crea una lista con elementos mezclando valores y {@code null}.</li>
 *   <li>ACT: Llama al método contador.</li>
 *   <li>ASSERT: Usa {@code assertEquals} con el conteo esperado.</li>
 * </ol></p>
 */
class ContadorElementosTestEnunciado {

	@Test
	void testConteo() {
		// --- 1️⃣ ARRANGE ---
		// Lista: ["A", null, "B"] -> Resultado esperado: 2
		List<String> lista = new ArrayList<>();
		lista.addAll(Arrays.asList("A", null, "B"));
		ContadorElementosSolucion calcular = new ContadorElementosSolucion();

		// --- 2️⃣ ACT ---

		int resultado = calcular.contarNoNulos(lista);

		// --- 3️⃣ ASSERT ---
		// TODO: Implementa el test

		assertEquals(2, resultado);

	}
}
