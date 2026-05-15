package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Encontrar Duplicado.
 * <b>Dificultad: Media</b>
 * 
 * <p>Dado un array de enteros 'nums' que contiene 'n + 1' enteros donde cada entero 
 * está en el rango [1, n] inclusive. Tu tarea es encontrar el único número duplicado 
 * en 'nums' sin modificar el array y usando solo espacio extra constante O(1).</p>
 * 
 * <p><b>💡 Algoritmo de la Tortuga y la Liebre (Floyd's Cycle-Finding):</b></p>
 * <p>Este algoritmo visualiza el array como una lista enlazada donde cada valor 
 * apunta al índice de ese valor. Si hay un duplicado, se formará un ciclo.</p>
 * 
 * <p><b>Ejemplo Visual:</b></p>
 * <pre>
 * Array: [1, 3, 4, 2, 2]
 * Índices: 0  1  2  3  4
 * 
 * Camino: 0 -> nums[0]=1 -> nums[1]=3 -> nums[3]=2 -> nums[2]=4 -> nums[4]=2 (¡CICLO!)
 *                                             ^----------------------|
 * </pre>
 * 
 * @param nums Array de enteros con un duplicado.
 * @return El número duplicado.
 */
public class EncontrarDuplicadoEnunciado {

    public int buscar(int[] nums) {
        // TODO: Implementa tu lógica aquí.
        return 0;
    }
}
