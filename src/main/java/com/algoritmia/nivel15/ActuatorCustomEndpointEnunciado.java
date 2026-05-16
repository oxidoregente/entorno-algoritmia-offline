package com.algoritmia.nivel15;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import java.util.Map;

/**
 * 🎓 RETO: Endpoint Personalizado de Actuator.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Puedes crear tus propios endpoints de Actuator para exponer 
 * información interna de la aplicación de forma segura.</p>
 */
@Component
@Endpoint(id = "resumen")
public class ActuatorCustomEndpointEnunciado {

    @ReadOperation
    public Map<String, String> obtenerResumen() {
        // TODO: Retorna un mapa con información como "estado: activo" 
        // y "version: 1.0".
        return null;
    }
}
