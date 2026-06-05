package com.algoritmia.nivel29.testing;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;

/**
 * 🎓 RETO: Pruebas Dinámicas (TestFactory).
 * <b>Dificultad: Difícil</b>
 *
 * <p>Cuando los casos de prueba no se conocen en tiempo de compilación — porque dependen
 * de filas de una base de datos, de un CSV, de la respuesta de un servicio o de
 * un conjunto generado algorítmicamente — JUnit 5 permite producir tests en tiempo
 * de ejecución con <code>@TestFactory</code>. Cada elemento del Stream se reporta en
 * el reporte como un test individual, manteniendo la trazabilidad.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El método anotado con <code>@TestFactory</code> debe devolver <code>Stream&lt;DynamicTest&gt;</code>, <code>Collection</code>, <code>Iterable</code> o <code>DynamicNode</code>.</li>
 *   <li>Cada <code>DynamicTest</code> se crea con <code>DynamicTest.dynamicTest(nombre, Executable)</code>.</li>
 *   <li>No se permiten streams infinitos: cada elemento debe poder ejecutarse y completarse.</li>
 *   <li>El nombre de cada test dinámico debe ser único para una correcta trazabilidad.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;TestFactory
 * Stream&lt;DynamicTest&gt; generarTestsDinamicos() {
 *     return IntStream.range(1, 4)
 *             .mapToObj(i -&gt; DynamicTest.dynamicTest("test " + i,
 *                     () -&gt; assertTrue(i &gt; 0)));
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>DynamicTest.dynamicTest("nombre", () -&gt; { ... })</code> con un Executable (lambda sin parámetros).</li>
 *   <li>Para generar datos, recurre a <code>Stream.of(...)</code>, <code>IntStream.range(...)</code> o una fuente externa.</li>
 *   <li>El Stream devuelto debe ser finito, si no JUnit lo rechazará en tiempo de ejecución.</li>
 * </ul>
 */
public class DynamicTestEnunciado {

    /**
     * Genera una serie de tests dinámicos a partir de una fuente
     * de datos arbitraria (p. ej. una lista o un stream).
     *
     * @return Stream finito de {@link DynamicTest} listo para ser ejecutado por JUnit 5.
     */
    @TestFactory
    public Stream<DynamicTest> generarTestsDinamicos() {
        // TODO: Usa DynamicTest.dynamicTest(nombre, executable)
        return null;
    }
}
