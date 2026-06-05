package com.algoritmia.nivel14.seguridad;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * SOLUCIÓN: Cifrador de Contraseñas.
 * 
 * <p>Envuelve {@link BCryptPasswordEncoder} para cifrar contraseñas
 * y verificar coincidencias usando el algoritmo bcrypt.</p>
 */
public class CifradorPasswordSolucion {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    /**
     * Cifra una contraseña en texto plano usando bcrypt.
     *
     * @param rawPassword la contraseña sin cifrar
     * @return el hash bcrypt, o {@code null} si la entrada es {@code null}
     */
    public String cifrar(String rawPassword) {
        if (rawPassword == null) return null;
        return encoder.encode(rawPassword);
    }

    /**
     * Verifica si una contraseña en texto plano coincide con un hash bcrypt.
     *
     * @param rawPassword     la contraseña sin cifrar
     * @param encodedPassword el hash bcrypt almacenado
     * @return {@code true} si coinciden, {@code false} en caso contrario
     */
    public boolean coinciden(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
}
