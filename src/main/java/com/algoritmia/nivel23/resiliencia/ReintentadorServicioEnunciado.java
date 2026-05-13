package com.algoritmia.nivel23.resiliencia;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 🎓 RETO: Estrategia de Reintentos (Retry).
 * <b>Dificultad: Media</b>
 * 
 * <p>Implementa un servicio que reintente una operación hasta 3 veces si esta falla.</p>
 */
@Service
public class ReintentadorServicioEnunciado {

    private AtomicInteger intentos = new AtomicInteger(0);

    @Retry(name = "reintentosVarios")
    public String operacionConFallaTemporal() {
        // TODO: Incrementa el contador de intentos
        // TODO: Si intentos < 3 -> Lanza RuntimeException
        // TODO: Si intentos == 3 -> Devuelve "Éxito tras reintentos"
        return null;
    }

    public int getIntentos() { return intentos.get(); }
}
