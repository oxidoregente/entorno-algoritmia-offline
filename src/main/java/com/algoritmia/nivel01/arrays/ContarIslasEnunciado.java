package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Contar Islas.
 * <b>Dificultad: Media</b>
 *
 * <p>Dada una matriz de caracteres `grid` que representa un mapa donde '1' es tierra
 * y '0' es agua, determina el número de islas.</p>
 *
 * <p>Una isla está rodeada por agua y se forma conectando tierras adyacentes
 * horizontal o verticalmente. Puedes asumir que los cuatro bordes de la cuadrícula
 * están rodeados de agua.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: grid = [
 *   ['1','1','0','0','0'],
 *   ['1','1','0','0','0'],
 *   ['0','0','1','0','0'],
 *   ['0','0','0','1','1']
 * ]
 * Salida: 3
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa Búsqueda en Profundidad (DFS) o Búsqueda en Amplitud (BFS).</li>
 *   <li>Cuando encuentres una celda con '1', incrementa el contador y "marca" toda la isla
 *       como visitada (cambiando los '1' a '0' o usando un array de visitados).</li>
 *   <li>La DFS puede implementarse de forma recursiva visitando las 4 direcciones adyacentes.</li>
 * </ul>
 */
public class ContarIslasEnunciado {

    /**
     * Cuenta el número de islas en una matriz bidimensional.
     *
     * @param grid Matriz de caracteres donde '1' es tierra y '0' es agua.
     * @return El número total de islas encontradas.
     */
    public int numIslands(char[][] grid) {
        // TODO: Implementa el conteo de islas usando DFS/BFS
        return 0;
    }
}
