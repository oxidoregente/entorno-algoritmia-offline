package com.algoritmia.nivel12.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * 🎓 RETO: Configuración de Seguridad con Roles.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa la autorización basada en roles (RBAC).</p>
 * 
 * <p><b>Requerimientos:</b></p>
 * <ul>
 *   <li>El endpoint /api/v1/auth/** debe ser público.</li>
 *   <li>El endpoint /api/v1/pagos/comision debe ser solo para ADMIN.</li>
 *   <li>Todo lo demás debe requerir autenticación.</li>
 * </ul>
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigEnunciado {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // TODO: Configurar reglas de autorización y desactivar CSRF
        return http.build();
    }
}
