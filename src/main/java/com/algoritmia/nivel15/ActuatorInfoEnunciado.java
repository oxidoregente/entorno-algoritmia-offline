package com.algoritmia.nivel15;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: Contribuidor de Información Personalizado.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Añade información personalizada (ej: versión de la app, nombre del autor) 
 * al endpoint /actuator/info.</p>
 */
@Component
public class ActuatorInfoEnunciado implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        // TODO: Añade un detalle llamado "autor" con tu nombre.
    }
}
