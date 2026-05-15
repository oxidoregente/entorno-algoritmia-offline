package com.algoritmia.nivel16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import java.util.Arrays;
import org.springframework.core.env.Environment;

/**
 * 🏆 SOLUCIONES: Nivel 16 - Gestión de Entornos (Profiles).
 */
public class ProfileSoluciones {

    // Ex 1: Verificar perfil activo
    public boolean esProduccion(Environment env) {
        return Arrays.asList(env.getActiveProfiles()).contains("prod");
    }

    // Ex 2: Bean condicional
    /*
    @Bean
    @Profile("dev")
    public String beanSoloParaDev() {
        return "Este bean solo existe en desarrollo";
    }
    */
}
