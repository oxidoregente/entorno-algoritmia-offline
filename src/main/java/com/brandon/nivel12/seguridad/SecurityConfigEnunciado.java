package com.brandon.nivel12.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * RETO: Configuración de Seguridad con Roles.
 * 
 * Implementa la autorización basada en roles (RBAC).
 * Requerimientos:
 * 1. El endpoint /api/v1/auth/** debe ser público.
 * 2. El endpoint /api/v1/pagos/comision debe ser solo para ADMIN.
 * 3. Todo lo demás debe requerir autenticación.
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
