package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * RETO: Escribe el test para el Contador de Elementos.
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
