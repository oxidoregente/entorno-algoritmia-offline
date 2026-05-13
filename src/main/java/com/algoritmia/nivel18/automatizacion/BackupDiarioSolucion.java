package com.algoritmia.nivel18.automatizacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 🏆 SOLUCIÓN: Backup Diario de Base de Datos.
 */
public class BackupDiarioSolucion {

    private static final Logger logger = LoggerFactory.getLogger(BackupDiarioSolucion.class);

    @Scheduled(cron = "0 0 2 * * *")
    public void realizarBackup() {
        logger.info(">> [CRON] Iniciando Backup de medianoche - Generando SQL dump...");
    }
}
