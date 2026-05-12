package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * SOLUCIÓN D: Historial de Logueos.
 */
@Entity
public class LogAccesoSolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;
    private LocalDateTime fechaAcceso;

    public LogAccesoSolucion() {}

    public LogAccesoSolucion(String ip, LocalDateTime fechaAcceso) {
        this.ip = ip;
        this.fechaAcceso = fechaAcceso;
    }
}
