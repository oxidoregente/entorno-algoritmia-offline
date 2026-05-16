package com.algoritmia.nivel16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Propiedades por Perfil.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Spring carga automáticamente archivos application-{profile}.properties. 
 * Esto permite definir valores diferentes para cada entorno.</p>
 */
@Component
public class ProfilePropsEnunciado {

    @Value("${app.mensaje}")
    private String mensaje;

    public String getMensaje() {
        // TODO: Asegúrate de tener definido 'app.mensaje' en application-dev.properties 
        // y application-prod.properties con valores distintos.
        return mensaje;
    }
}
