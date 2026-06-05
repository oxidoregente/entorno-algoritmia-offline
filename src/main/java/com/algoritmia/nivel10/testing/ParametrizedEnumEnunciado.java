package com.algoritmia.nivel10.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * 🎓 RETO: Pruebas con Enums.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Cuando un comportamiento depende del valor de un enumerado (roles, estados,
 * categorías), resulta muy útil iterar por todos los valores automáticamente.
 * JUnit 5 ofrece <code>@EnumSource</code>, que inyecta cada constante del enum
 * como argumento del test, sin necesidad de escribir un bucle a mano ni de
 * duplicar métodos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Se anota con <code>@EnumSource(Role.class)</code> para iterar por todas las constantes.</li>
 *   <li>Se puede restringir a ciertos valores con <code>names = {"ADMIN", "USER"}</code> o <code>mode = Mode.EXCLUDE</code>.</li>
 *   <li>Combina siempre con <code>@ParameterizedTest</code>.</li>
 *   <li>El parámetro del método debe ser del tipo del enum (o un supertipo compatible).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;ParameterizedTest
 * &#64;EnumSource(Role.class)
 * void testLectura(Role role) {
 *     assertNotNull(role);
 *     assertTrue(servicio.tieneAccesoLectura(role));
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Añade <code>@EnumSource(Role.class)</code> justo encima del método de test.</li>
 *   <li>No olvides la anotación <code>@ParameterizedTest</code> a nivel de método.</li>
 *   <li>Si quieres ignorar alguna constante, usa <code>names = {...}</code> con los nombres exactos.</li>
 * </ul>
 */
public class ParametrizedEnumEnunciado {

    /**
     * Roles del sistema sobre los que se itera automáticamente
     * en el test parametrizado.
     */
    public enum Role { ADMIN, USER, GUEST }

    /**
     * Verifica que el rol recibido disponga de permisos de lectura,
     * ejecutándose una vez por cada valor del enum.
     *
     * @param role rol del usuario bajo prueba, inyectado por {@code @EnumSource}.
     */
    public void testLectura(Role role) {
        // Assertions.assertNotNull(role);
    }
}
