package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Verificador de Conexión.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En arquitecturas distribuidas, un <b>health check</b>
 * periódico confirma que el servicio sigue vivo y puede
 * alcanzar sus dependencias críticas (base de datos, broker,
 * APIs externas). Este reto implementa la variante más
 * simple: una tarea programada que registra un ping en logs
 * cada 30 segundos, sentando las bases para evolucionar a
 * un indicador real de salud.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Aplicar {@code @Scheduled(fixedRate = 30_000)} sobre el método a ejecutar.</li>
 *   <li>El método debe ser público y no recibir argumentos.</li>
 *   <li>Asegúrate de tener {@code @EnableScheduling} en una clase de configuración
 *       para que Spring reconozca las anotaciones.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;Service
 * public class VerificadorConexionEnunciado {
 *     &#64;Scheduled(fixedRate = 30_000)
 *     public void verificar() {
 *         System.out.println("Ping al Servidor Central");
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Prefiere {@code Logger} de SLF4J sobre {@code System.out.println} en producción.</li>
 *   <li>El valor 30 000 ms equivale a 30 segundos; usa la constante
 *       {@code TimeUnit.SECONDS.toMillis(30)} para mayor legibilidad.</li>
 * </ul>
 */
@Service
public class VerificadorConexionEnunciado {

    /**
     * Realiza el "ping" al servidor central, registrándolo en los logs.
     * Debe ejecutarse automáticamente cada 30 segundos.
     */
    // TODO: Define el @Scheduled con un fixedRate de 30 segundos
    public void verificar() {
        // TODO: Imprime el mensaje de ping
    }
}
