package com.brandon.nivel18.automatizacion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Nivel 18: Automatización de Tareas con Spring Scheduler.
 * 
 * <p>Esta clase demuestra cómo programar tareas que se ejecutan de forma autónoma
 * en segundo plano, basándose en intervalos de tiempo o expresiones Cron.</p>
 */
@Service
public class TareaMantenimiento {

    private static final Logger logger = LoggerFactory.getLogger(TareaMantenimiento.class);

    /**
     * Tarea de mantenimiento simulada que se ejecuta cada 5 minutos.
     * fixedRate: indica el intervalo en milisegundos.
     */
    @Scheduled(fixedRate = 300000) // 5 minutos
    public void ejecutarLimpiezaCache() {
        logger.info(">> [AUTOMATIZACIÓN] Iniciando tarea de limpieza de caché programada - {}", LocalDateTime.now());
        // Aquí iría la lógica real de limpieza
        logger.info("<< [AUTOMATIZACIÓN] Tarea de limpieza finalizada exitosamente.");
    }

    /**
     * Tarea de reporte de salud que se ejecuta cada hora usando expresión Cron.
     * Estructura: "segundos minutos horas día mes día-semana"
     */
    @Scheduled(cron = "0 0 * * * *")
    public void generarReporteSalud() {
        logger.info(">> [CRON] Generando reporte horario de salud del sistema...");
    }
}
