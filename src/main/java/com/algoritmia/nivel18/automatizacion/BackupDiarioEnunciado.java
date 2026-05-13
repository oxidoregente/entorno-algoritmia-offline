package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Backup Diario de Base de Datos.
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa una tarea que simule un backup completo del sistema.</p>
 * 
 * <p><b>Regla:</b> Debe ejecutarse todas las noches exactamente a las 02:00 AM.</p>
 */
@Service
public class BackupDiarioEnunciado {

    // TODO: Define el @Scheduled usando una expresión CRON (0 0 2 * * *)
    public void realizarBackup() {
        // TODO: Imprime "Iniciando Backup de medianoche..."
    }
}
