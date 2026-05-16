package com.algoritmia.nivel18.automatizacion;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 🎓 RETO: FixedRate vs FixedDelay.
 * <b>Dificultad: Media</b>
 * 
 * <p>Es crucial entender la diferencia entre ejecutar cada X tiempo 
 * desde el INICIO de la última ejecución (FixedRate) o desde el FIN 
 * de la última ejecución (FixedDelay).</p>
 */
@Component
public class FixedDelayVsRateEnunciado {

    /**
     * Se ejecuta cada 5 segundos, sin importar cuánto dure la tarea.
     */
    @Scheduled(fixedRate = 5000)
    public void tareaFrecuente() {
        // Implementación
    }

    /**
     * Se ejecuta 5 segundos DESPUÉS de que termine la anterior.
     * <b>💡 Tarea:</b> Añade la anotación correcta para fixedDelay de 5 segundos.
     */
    public void tareaSecuencial() {
        // Implementación
    }
}
