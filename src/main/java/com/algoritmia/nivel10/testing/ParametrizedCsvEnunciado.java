package com.algoritmia.nivel10.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * 🎓 RETO: Pruebas Parametrizadas con CSV.
 * <b>Dificultad: Media</b>
 *
 * <p>Repetir un test cambiando únicamente los datos de entrada es tedioso y propenso a
 * olvidos. JUnit 5 lo resuelve con <code>@ParameterizedTest</code> y fuentes de datos
 * como <code>@CsvSource</code>: cada fila del CSV se mapea a los parámetros del método,
 * generándose un test por fila. Ideal para validar reglas de negocio con múltiples
 * combinaciones de valores.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El método se anota con <code>@ParameterizedTest</code> y una fuente de datos (<code>@CsvSource</code>, <code>@MethodSource</code>, etc.).</li>
 *   <li>Cada fila del CSV se asocia posicionalmente a los parámetros del método.</li>
 *   <li>Los argumentos se convierten automáticamente al tipo declarado (int, String, etc.).</li>
 *   <li>Es posible separar múltiples filas con <code>\n</code> en un array, o cargar ficheros externos con <code>@CsvFileSource</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;ParameterizedTest
 * &#64;CsvSource({
 *     "1, 1, 2",
 *     "5, 5, 10",
 *     "10, -2, 8"
 * })
 * void testSuma(int a, int b, int esperado) {
 *     assertEquals(esperado, a + b);
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Combina <code>@ParameterizedTest</code> con <code>@CsvSource({"a,b,esperado", ...})</code>.</li>
 *   <li>El número de columnas debe coincidir con el número de parámetros del método.</li>
 *   <li>Si necesitas un valor textual con coma, rodéalo de comillas dobles: <code>"'a,b'"</code>.</li>
 * </ul>
 */
public class ParametrizedCsvEnunciado {

    /**
     * Verifica que la suma de dos números cumple con el resultado esperado
     * para múltiples combinaciones de entrada.
     *
     * @param a        primer sumando de la operación.
     * @param b        segundo sumando de la operación.
     * @param esperado valor que debería producir <code>a + b</code>.
     */
    public void testSuma(int a, int b, int esperado) {
        // Assertions.assertEquals(esperado, a + b);
    }
}
