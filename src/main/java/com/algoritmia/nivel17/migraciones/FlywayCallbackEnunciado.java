package com.algoritmia.nivel17.migraciones;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Event;
import org.flywaydb.core.api.callback.Context;

/**
 * 🎓 RETO: Callbacks de Flyway.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Además de las migraciones SQL, Flyway permite enganchar
 * código Java a eventos del ciclo de vida de la migración:
 * {@code BEFORE_MIGRATE}, {@code AFTER_MIGRATE},
 * {@code BEFORE_EACH_MIGRATE}, {@code AFTER_EACH_MIGRATE},
 * {@code AFTER_CLEAN}, etc. Esto resulta útil para auditar,
 * invalidar cachés, notificar al equipo o registrar la
 * versión desplegada en un sistema externo (CMDB, Sentry).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementar la interfaz {@link Callback} de Flyway, que define cuatro métodos:
 *       {@code supports}, {@code handle}, {@code canHandleInTransaction} y {@code getCallbackName}.</li>
 *   <li>{@code supports} decide si el callback reacciona al evento recibido.</li>
 *   <li>{@code canHandleInTransaction} indica si Flyway debe invocarlo dentro de la
 *       transacción SQL principal (suele ser {@code true}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public class FlywayCallbackEnunciado implements Callback {
 *     &#64;Override
 *     public boolean supports(Event event, Context context) {
 *         return event == Event.AFTER_MIGRATE;
 *     }
 *
 *     &#64;Override
 *     public void handle(Event event, Context context) {
 *         log.info("Migración Flyway finalizada con éxito");
 *     }
 *
 *     &#64;Override
 *     public boolean canHandleInTransaction(Event event, Context context) {
 *         return true;
 *     }
 *
 *     &#64;Override
 *     public String getCallbackName() {
 *         return "AuditorMigraciones";
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code event == Event.AFTER_MIGRATE} en {@code supports} para reaccionar
 *       solo a ese evento.</li>
 *   <li>Si necesitas ejecutar SQL desde el callback, inyecta el {@code JdbcTemplate} y
 *       hazlo en {@code handle()}; respeta {@code canHandleInTransaction} según corresponda.</li>
 * </ul>
 */
public class FlywayCallbackEnunciado implements Callback {

    /**
     * Indica si este callback reacciona al evento recibido.
     *
     * @param event   evento de Flyway que se está procesando
     * @param context contexto de la migración (conexiones, configuración)
     * @return {@code true} solo cuando el evento es {@link Event#AFTER_MIGRATE}
     */
    @Override
    public boolean supports(Event event, Context context) {
        // TODO: Retorna true si el evento es AFTER_MIGRATE
        return false;
    }

    /**
     * Lógica que se ejecuta cuando el evento es aceptado por {@link #supports(Event, Context)}.
     *
     * @param event   evento aceptado
     * @param context contexto de la migración
     */
    @Override
    public void handle(Event event, Context context) {
        // TODO: Registra un log informando que la migración terminó con éxito.
    }

    /**
     * Indica si Flyway debe invocar este callback dentro de la misma transacción SQL.
     *
     * @param event   evento actual
     * @param context contexto de la migración
     * @return {@code true} para que se ejecute dentro de la transacción
     */
    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return true;
    }

    /**
     * Nombre del callback, útil para diagnóstico en logs y tablas Flyway.
     *
     * @return identificador legible del callback
     */
    @Override
    public String getCallbackName() {
        return "AuditorMigraciones";
    }
}
