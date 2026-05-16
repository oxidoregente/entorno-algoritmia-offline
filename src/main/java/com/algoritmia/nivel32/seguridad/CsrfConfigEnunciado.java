package com.algoritmia.nivel32.seguridad;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * 🎓 RETO: Configuración de CSRF (Cross-Site Request Forgery).
 * <b>Dificultad: Media</b>
 * 
 * <p>CSRF es un ataque que obliga a un usuario autenticado a ejecutar 
 * acciones no deseadas. Spring Security lo habilita por defecto.</p>
 */
public class CsrfConfigEnunciado {

    public void configurarCsrf(HttpSecurity http) throws Exception {
        // TODO: ¿Cómo deshabilitarías CSRF para APIs REST que no usan sesiones?
        // TODO: ¿Cómo configurarías un repositorio de tokens CSRF en cookies?
    }
}
