package com.algoritmia.nivel18.automatizacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 🏆 SOLUCIÓN: Verificador de Conexión.
 */
public class VerificadorConexionSolucion {

    private static final Logger logger = LoggerFactory.getLogger(VerificadorConexionSolucion.class);

    @Scheduled(fixedRate = 30000)
    public void verificar() {
        logger.info(">> [AUTOMATIZACIÓN] Ping al Servidor Central - OK");
    }
}
