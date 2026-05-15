package com.algoritmia.nivel07.aspectos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 🏆 SOLUCIÓN: Interceptador de Errores Global.
 * 
 * <p>El consejo 'AfterThrowing' es ideal para auditoría de fallos sin 
 * interferir con el flujo normal de las excepciones.</p>
 */
public class InterceptadorErroresSolucion {

    private static final Logger log = LoggerFactory.getLogger(InterceptadorErroresSolucion.class);

    public void capturarError(Exception ex) {
        log.error("💥 EXCEPCIÓN DETECTADA POR ASPECTO: {}", ex.getMessage());
        // Aquí podrías enviar una alerta a Slack, Email, etc.
    }
}
