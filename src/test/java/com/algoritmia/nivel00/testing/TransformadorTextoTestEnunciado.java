package com.algoritmia.nivel00.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * RETO: Escribe el test para el Transformador de Texto.
 */
class TransformadorTextoTestEnunciado {

    @Test
    void testFormateo() {
        // --- 1️⃣ ARRANGE ---
        // Texto: "  java  " -> Resultado esperado: "JAVA"
    	String texto = "   java   ";
    	String textoEsperado = "JAVA";
    	TransformadorTextoSolucion transformador = new TransformadorTextoSolucion();
        
        // --- 2️⃣ ACT ---
    	
    	String resultado = transformador.formatear(texto);
        
        // --- 3️⃣ ASSERT ---
        // TODO: Implementa el test usando assertEquals
    	assertEquals(textoEsperado, resultado);
    }
}
