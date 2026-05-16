package com.algoritmia.nivel16;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 🎓 RETO: Perfiles Negativos (!).
 * <b>Dificultad: Media</b>
 * 
 * <p>Puedes configurar componentes para que se carguen SOLO si un perfil 
 * NO está activo.</p>
 */
@Configuration
@Profile("!prod")
public class ProfileNoProdEnunciado {
    // TODO: ¿Qué significa @Profile("!prod")? 
    // Significa que este componente se cargará en cualquier perfil EXCEPTO en prod.
    
    public String getAmbiente() {
        return "Ambiente No Seguro (Testing/Dev)";
    }
}
