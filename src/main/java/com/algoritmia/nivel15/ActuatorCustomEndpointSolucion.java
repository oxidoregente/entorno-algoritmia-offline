package com.algoritmia.nivel15;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import java.util.HashMap;
import java.util.Map;

/**
 * 🏆 SOLUCIÓN: Endpoint Personalizado de Actuator.
 */
public class ActuatorCustomEndpointSolucion {

    @ReadOperation
    public Map<String, String> obtenerResumen() {
        Map<String, String> resumen = new HashMap<>();
        resumen.put("estado", "activo");
        resumen.put("version", "1.0");
        resumen.put("autor", "Brandon");
        return resumen;
    }
}
