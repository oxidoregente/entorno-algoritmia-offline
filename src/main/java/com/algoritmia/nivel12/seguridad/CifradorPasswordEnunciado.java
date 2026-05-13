package com.algoritmia.nivel12.seguridad;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Cifrador de Contraseñas.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio de seguridad que cifre contraseñas usando algoritmos 
 * modernos y verifique si una contraseña plana coincide con una cifrada.</p>
 */
@Service
public class CifradorPasswordEnunciado {

    public String cifrar(String rawPassword) {
        // TODO: Implementa cifrado (simulado o usando BCrypt)
        return null;
    }

    public boolean coinciden(String rawPassword, String encodedPassword) {
        // TODO: Verifica la coincidencia
        return false;
    }
}
