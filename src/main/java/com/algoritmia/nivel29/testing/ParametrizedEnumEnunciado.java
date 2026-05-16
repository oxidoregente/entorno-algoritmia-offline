package com.algoritmia.nivel29.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * 🎓 RETO: Pruebas con Enums.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>JUnit 5 permite pasar todos los valores de un Enum automáticamente 
 * a un test.</p>
 */
public class ParametrizedEnumEnunciado {

    public enum Role { ADMIN, USER, GUEST }

    /**
     * Verifica que todos los roles tengan acceso de lectura.
     * <b>💡 Tarea:</b> Usa @EnumSource(Role.class).
     */
    public void testLectura(Role role) {
        // Assertions.assertNotNull(role);
    }
}
