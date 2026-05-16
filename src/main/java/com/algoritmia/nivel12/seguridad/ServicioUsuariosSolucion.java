package com.algoritmia.nivel12.seguridad;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.Collections;

/**
 * 🏆 SOLUCIÓN: Servicio de Detalles de Usuario (UserDetailsService).
 * 
 * <p>En una aplicación real, buscarías en una base de datos usando un repositorio. 
 * Aquí simulamos la búsqueda para entender el contrato de la interfaz.</p>
 */
public class ServicioUsuariosSolucion implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if ("admin@algoritmia.com".equals(email)) {
            return new User("admin@algoritmia.com", 
                "admin123", // En prod esto debe estar cifrado con BCrypt
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
        }
        throw new UsernameNotFoundException("Usuario no encontrado: " + email);
    }
}
