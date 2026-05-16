package com.algoritmia.nivel16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 🎓 RETO: Beans Condicionales por Perfil.
 * <b>Dificultad: Media</b>
 * 
 * <p>A veces necesitamos un bean diferente según el entorno (ej: un 
 * conector de base de datos real en prod y uno simulado en dev).</p>
 */
@Configuration
public class ProfileBeanEnunciado {

    @Bean
    @Profile("dev")
    public String dataSourceDev() {
        return "H2-Memory-Database";
    }

    @Bean
    // TODO: Añade la anotación @Profile para que este bean solo se cargue en "prod"
    public String dataSourceProd() {
        return "PostgreSQL-External-Database";
    }
}
