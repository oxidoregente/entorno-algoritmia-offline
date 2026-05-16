package com.algoritmia.nivel17.migraciones;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Event;
import org.flywaydb.core.api.callback.Context;

/**
 * 🎓 RETO: Callbacks de Flyway.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Los callbacks permiten ejecutar código Java en eventos específicos 
 * de la migración (ej: antes de limpiar la DB, después de cada migración).</p>
 */
public class FlywayCallbackEnunciado implements Callback {

    @Override
    public boolean supports(Event event, Context context) {
        // TODO: Retorna true si el evento es AFTER_MIGRATE
        return false;
    }

    @Override
    public void handle(Event event, Context context) {
        // TODO: Registra un log informando que la migración terminó con éxito.
    }

    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return true;
    }
    
    @Override
    public String getCallbackName() {
        return "AuditorMigraciones";
    }
}
