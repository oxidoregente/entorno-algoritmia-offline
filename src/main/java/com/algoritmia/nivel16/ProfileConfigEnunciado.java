package com.algoritmia.nivel16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Acceso a Perfiles Activos.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Usa la interfaz {@link Environment} de Spring para determinar 
 * si el perfil 'prod' está activo actualmente.</p>
 */
@Component
public class ProfileConfigEnunciado {

    @Autowired
    private Environment env;

    public boolean esProduccion() {
        // TODO: Verifica si el arreglo env.getActiveProfiles() contiene "prod"
        return false;
    }
}
