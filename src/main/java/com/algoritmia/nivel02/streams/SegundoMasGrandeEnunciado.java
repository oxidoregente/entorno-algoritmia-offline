package com.algoritmia.nivel02.streams;

import java.util.Comparator;
import java.util.List;

/**
 * 🎓 RETO: Segundo Número Más Grande.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Dada una lista de enteros, encuentra el segundo número más grande
 * utilizando exclusivamente la API de Streams de Java.</p>
 *
 * <p>Si la lista tiene menos de 2 números distintos, debe retornar `null`.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: [10, 5, 8, 10, 3]
 * Salida:  8
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `.distinct()` para eliminar duplicados.</li>
 *   <li>Ordena en orden descendente con `.sorted(Comparator.reverseOrder())`.</li>
 *   <li>Usa `.skip(1)` para omitir el más grande y `.findFirst()` para obtener el segundo.</li>
 * </ul>
 */
public class SegundoMasGrandeEnunciado {

    /**
     * Encuentra el segundo número más grande en una lista de enteros.
     *
     * @param numeros Lista de enteros de entrada.
     * @return El segundo número más grande, o null si no existe.
     */
    public Integer encontrar(List<Integer> numeros) {
        // TODO: Implementa usando distinct, sorted, skip y findFirst
        return numeros.stream()
        		.distinct()
        		.sorted(Comparator.reverseOrder())
        		.skip(1)
        		.findFirst()
        		.get();
    }
}
