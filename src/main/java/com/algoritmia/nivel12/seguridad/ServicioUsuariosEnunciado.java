package com.algoritmia.nivel12.seguridad;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Servicio de Detalles de Usuario (UserDetailsService).
 * <b>Dificultad: Media</b>
 * 
 * <p>Spring Security necesita una forma de cargar los datos del usuario 
 * (como password y roles) desde una fuente de datos (DB, Memoria, etc.).</p>
 * 
 * <p><b>💡 Tarea:</b> Implementa la interfaz {@link UserDetailsService} para 
 * buscar un usuario por su email y retornar un objeto {@link UserDetails}.</p>
 */
@Service
public class ServicioUsuariosEnunciado implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // TODO: Implementa la búsqueda del usuario. 
        // Si el email es "admin@algoritmia.com", retorna un UserDetails con 
        // password "admin123" y rol "ADMIN". De lo contrario, lanza UsernameNotFoundException.
        return null;
    }
}
