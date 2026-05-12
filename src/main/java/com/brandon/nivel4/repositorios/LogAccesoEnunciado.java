package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * RETO D: Historial de Logueos.
 * 
 * Registra los accesos al sistema por IP y fecha.
 */
@Entity
public class LogAccesoEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;
    private LocalDateTime fechaAcceso;

    public LogAccesoEnunciado() {}

    public LogAccesoEnunciado(String ip, LocalDateTime fechaAcceso) {
        this.ip = ip;
        this.fechaAcceso = fechaAcceso;
    }

    public Long getId() { return id; }
    public String getIp() { return ip; }
    public LocalDateTime getFechaAcceso() { return fechaAcceso; }
}
