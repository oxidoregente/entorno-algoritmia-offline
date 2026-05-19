package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Filtrar Números Primos.
 * <b>Dificultad: Media</b>
 *
 * <p>Dada una lista de números enteros, filtra solo aquellos que son números primos
 * y devuelve una nueva lista con los resultados.</p>
 *
 * <p>Un número primo es aquel mayor que 1 que solo es divisible por sí mismo y por 1.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: [2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Salida:  [2, 3, 5, 7]
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Crea un método helper `esPrimo(int n)` para verificar la primalidad.</li>
 *   <li>Usa `stream().filter(this::esPrimo).collect(Collectors.toList())`.</li>
 *   <li>Para verificar si es primo, itera desde 2 hasta la raíz cuadrada del número.</li>
 * </ul>
 */
public class FiltroPrimosEnunciado {

    /**
     * Filtra los números primos de una lista de enteros.
     *
     * @param numeros Lista de enteros de entrada.
     * @return Lista conteniendo solo los números primos.
     */
    public List<Integer> filtrar(List<Integer> numeros) {
        // TODO: Implementa el filtrado de números primos con streams
        return null;
    }
}
