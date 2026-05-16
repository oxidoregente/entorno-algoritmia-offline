package com.algoritmia.nivel16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * 🏆 SOLUCIONES: Beans, Propiedades y Negación de Perfiles.
 */
public class ProfileExtraSoluciones {

    // Beans Condicionales
    @Bean
    @Profile("prod")
    public String dataSourceProd() {
        return "PostgreSQL-External-Database";
    }

    // Perfiles Negativos
    /*
    @Profile("!prod") -> Carga el bean si el perfil NO es 'prod'
    */

    // Propiedades
    /*
    application-dev.properties: app.mensaje=Bienvenido a Desarrollo
    application-prod.properties: app.mensaje=Bienvenido a Producción
    */
}
