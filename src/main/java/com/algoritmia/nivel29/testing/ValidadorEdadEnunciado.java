package com.algoritmia.nivel29.testing;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Validador de Edad con Pruebas Parametrizadas.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Implementa un servicio que determine si una persona es mayor de
 * edad (18 años o más).</p>
 *
 * <p>El verdadero reto de este ejercicio está en los tests:
 * aprende a usar pruebas parametrizadas de JUnit 5 para verificar
 * múltiples valores de entrada sin duplicar código.</p>
 *
 * <h3>Example:</h3>
 * <pre>
 * esMayorDeEdad(17) -> false
 * esMayorDeEdad(18) -> true
 * esMayorDeEdad(25) -> true
 * </pre>
 */
@Service
public class ValidadorEdadEnunciado {

    /**
     * Determina si una persona es mayor de edad (18 años o más).
     *
     * @param edad Edad de la persona a evaluar.
     * @return {@code true} si la edad es >= 18, {@code false} en caso contrario.
     */
    public boolean esMayorDeEdad(int edad) {
        // TODO: Implementa la validación simple
        return false;
    }
}
