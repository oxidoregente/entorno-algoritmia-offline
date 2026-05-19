package com.algoritmia.nivel01.arrays;

/**
 * 🎓 RETO: Producto de Array Excepto Propio.
 * <b>Dificultad: Media</b>
 *
 * <p>Dado un array de enteros `nums`, implementa una función que devuelva un nuevo array
 * `resultado` tal que `resultado[i]` sea igual al producto de todos los elementos de `nums`
 * excepto el propio `nums[i]`.</p>
 *
 * <h3>Restricciones:</h3>
 * <ul>
 *   <li>No puedes usar la operación de división.</li>
 *   <li>Debes implementarlo con complejidad temporal O(n).</li>
 *   <li>El uso de espacio extra es opcional pero se prefiere O(1) sin contar el array de salida.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: nums = [1, 2, 3, 4]
 * Salida:  [24, 12, 8, 6]
 * Explicación:
 *   resultado[0] = 1 * 2 * 3 * 4 = 24
 *   resultado[1] = 1 * 1 * 3 * 4 = 12
 *   resultado[2] = 1 * 2 * 1 * 4 = 8
 *   resultado[3] = 1 * 2 * 3 * 1 = 6
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Calcula primero los productos de los elementos a la izquierda de cada posición.</li>
 *   <li>Luego multiplica esos productos por los productos de los elementos a la derecha.</li>
 *   <li>Puedes usar un solo array para almacenar los resultados parciales y finales.</li>
 * </ul>
 */
public class ProductoExceptoPropioEnunciado {

    /**
     * Calcula un array donde cada elemento es el producto de todos los demás elementos del array original.
     *
     * @param nums Array de enteros de entrada.
     * @return Un nuevo array con los productos calculados, o null si la entrada es inválida.
     */
    public int[] calcular(int[] nums) {
        // TODO: Implementa el cálculo en O(n) sin usar división
        return null;
    }
}
