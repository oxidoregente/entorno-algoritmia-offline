package com.algoritmia.nivel10.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 🎓 RETO: Orden de Ejecución de Tests.
 * <b>Dificultad: Fácil</b>
 *
 * <p>La regla de oro del testing dice que cada test debe ser independiente, pero en
 * escenarios de integración o flujos de extremo a extremo (crear → consultar → actualizar
 * → eliminar) necesitamos un orden determinista. JUnit 5 lo consigue combinando
 * <code>@TestMethodOrder(MethodOrderer.OrderAnnotation.class)</code> a nivel de clase
 * con la anotación <code>@Order(n)</code> en cada método.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El orden se declara a nivel de clase con <code>@TestMethodOrder(...)</code>.</li>
 *   <li>Cada método se numera con <code>@Order(1)</code>, <code>@Order(2)</code>, etc. (menor = antes).</li>
 *   <li>Los métodos sin <code>@Order</code> se ejecutan después de los ordenados, en un orden no garantizado.</li>
 *   <li>Existen otros <em>orderers</em> como <code>MethodName</code> o <code>Random</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;TestMethodOrder(MethodOrderer.OrderAnnotation.class)
 * class FlujoIT {
 *
 *     &#64;Test &#64;Order(1)
 *     void crear() { ... }
 *
 *     &#64;Test &#64;Order(2)
 *     void leer() { ... }
 *
 *     &#64;Test &#64;Order(3)
 *     void borrar() { ... }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Añade <code>@Order(1)</code> a <code>primero()</code> y <code>@Order(2)</code> a <code>segundo()</code>.</li>
 *   <li>Los <code>@Test</code> siguen siendo obligatorios para que JUnit los reconozca como tests.</li>
 *   <li>Si necesitas interdependencia entre tests, prefiere <code>@TestInstance(Lifecycle.PER_CLASS)</code> y estado compartido.</li>
 * </ul>
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderEnunciado {

    /**
     * Primer test en ejecutarse dentro del flujo ordenado.
     * Recibe <code>@Order(1)</code>.
     */
    public void primero() {}

    /**
     * Segundo test en ejecutarse dentro del flujo ordenado.
     * Recibe <code>@Order(2)</code>.
     */
    public void segundo() {}
}
