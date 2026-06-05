package com.algoritmia.nivel12.seguridad;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Cifrador de Contraseñas.
 * <b>Dificultad: Media</b>
 *
 * <p>Implementa un servicio de seguridad encargado de cifrar contraseñas
 * usando algoritmos modernos (típicamente BCrypt) y de verificar si una
 * contraseña en claro coincide con una ya cifrada. Es la pieza clave para
 * <i>nunca</i> almacenar contraseñas en plano en la base de datos.</p>
 *
 * <p><b>Reglas / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@link #cifrar(String)} debe devolver una cadena no reversible a
 *       partir de la contraseña en claro.</li>
 *   <li>{@link #coinciden(String, String)} debe validar una contraseña en
 *       plano contra un hash previamente generado.</li>
 *   <li>Usa siempre algoritmos con <i>salt</i> automático (BCrypt, Argon2,
 *       SCrypt) y nunca implementes tu propio cifrado.</li>
 *   <li>BCrypt genera cadenas de ~60 caracteres con el salt incluido.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * String hash = cifrador.cifrar("secreto123");
 * // hash = "$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy"
 *
 * boolean ok = cifrador.coinciden("secreto123", hash); // true
 * boolean ko = cifrador.coinciden("otro",       hash); // false
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>BCrypt está disponible en Spring Security: añade
 *       {@code spring-boot-starter-security} y usa {@code BCryptPasswordEncoder}.</li>
 *   <li>En el simulacro, una implementación válida puede simplemente devolver
 *       un hash determinista (por ejemplo invertir el string + base64) mientras
 *       el método de verificación sea coherente.</li>
 *   <li>Si la contraseña en claro es {@code null} o vacía, lanza
 *       {@link IllegalArgumentException}.</li>
 * </ul>
 */
@Service
public class CifradorPasswordEnunciado {

    /**
     * Cifra una contraseña en claro aplicando un algoritmo de hashing
     * con salt.
     *
     * @param rawPassword contraseña en plano proporcionada por el usuario.
     * @return hash resultante (no reversible).
     */
    public String cifrar(String rawPassword) {
        // TODO: Implementa cifrado (simulado o usando BCrypt)
        return null;
    }

    /**
     * Verifica si una contraseña en claro coincide con un hash previamente
     * generado.
     *
     * @param rawPassword    contraseña en plano a comprobar.
     * @param encodedPassword hash almacenado contra el que se compara.
     * @return {@code true} si la contraseña coincide, {@code false} en caso
     *         contrario.
     */
    public boolean coinciden(String rawPassword, String encodedPassword) {
        // TODO: Verifica la coincidencia
        return false;
    }
}
