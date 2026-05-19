package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Log de Acceso.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Registra los accesos al sistema con dirección IP y fecha.
 * El repositorio asociado deberá buscar logs entre dos fechas.</p>
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
