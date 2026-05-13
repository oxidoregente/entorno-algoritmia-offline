package com.algoritmia.nivel12.seguridad;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 🏆 SOLUCIÓN: Cifrador de Contraseñas.
 */
public class CifradorPasswordSolucion {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String cifrar(String rawPassword) {
        if (rawPassword == null) return null;
        return encoder.encode(rawPassword);
    }

    public boolean coinciden(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }
}
