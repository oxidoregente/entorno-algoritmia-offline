package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Backup Diario de Base de Datos.
 * <b>Dificultad: Media</b>
 *
 * <p>Toda aplicación en producción necesita respaldos
 * periódicos. Spring Scheduling permite ejecutar tareas
 * recurrentes sin librerías externas (Quartz) gracias a la
 * anotación {@code @Scheduled}, que admite expresiones
 * <b>CRON</b> Unix para definir horarios complejos
 * (ej. "todos los días a las 02:00 AM"). En este reto
 * simulamos un backup nocturno de la base de datos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Habilitar el programador con {@code @EnableScheduling} en una clase de configuración.</li>
 *   <li>Aplicar {@code @Scheduled(cron = "...")} sobre el método a ejecutar (debe ser
 *       público y sin argumentos).</li>
 *   <li>La expresión CRON de Spring tiene 6 campos:
 *       {@code segundo minuto hora día-del-mes mes día-de-la-semana}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class BackupDiarioEnunciado {
 *     &#64;Scheduled(cron = "0 0 2 * * *")
 *     public void realizarBackup() {
 *         System.out.println("Iniciando Backup de medianoche...");
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Para las 02:00 AM exactas, la expresión es
 *       {@code "0 0 2 * * *"} (segundo 0, minuto 0, hora 2, cualquier día, cualquier mes, cualquier día de la semana).</li>
 *   <li>Considera usar {@code zone = "America/Mexico_City"} en {@code @Scheduled} para
 *       evitar que el horario cambie con la zona del servidor.</li>
 * </ul>
 */
@Service
public class BackupDiarioEnunciado {

    /**
     * Realiza la simulación de un backup completo del sistema.
     * Se debe programar con {@code @Scheduled(cron = "0 0 2 * * *")} para
     * ejecutarse todos los días a las 02:00 AM.
     */
    // TODO: Define el @Scheduled usando una expresión CRON (0 0 2 * * *)
    public void realizarBackup() {
        // TODO: Imprime "Iniciando Backup de medianoche..."
    }
}
