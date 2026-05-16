package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Compartimentación (Bulkhead).
 * <b>Dificultad: Difícil</b>
 * 
 * <p>El patrón Bulkhead aísla los recursos del sistema (ej: hilos) para 
 * que si un servicio falla, no agote todos los recursos y tire el resto 
 * de la aplicación.</p>
 */
@Service
public class BulkheadEnunciado {

    /**
     * Limita las ejecuciones concurrentes de este método.
     * <b>💡 Pista:</b> Usa @Bulkhead(name = "servicioLento", type = Bulkhead.Type.THREADPOOL)
     */
    public String tareaPesada() {
        return "Resultado pesado";
    }
}
