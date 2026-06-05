package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Log de Acceso.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Registra cada acceso al sistema con la IP del cliente y la fecha exacta.
 * Es la base de auditorías de seguridad, detección de patrones de fraude o
 * cumplimiento normativo (GDPR/LOPD).</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code ip}: dirección IP del cliente que accedió.</li>
 *   <li>{@code fechaAcceso}: timestamp del evento ({@link LocalDateTime}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new LogAccesoEnunciado("10.0.0.1", LocalDateTime.now()));
 *
 * // findByFechaAccesoBetween(ayer, hoy) -&gt; logs de las últimas 24h
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 *   <li>Para auditoría avanzada (creado por, modificado por, etc.) podrías añadir Spring Data Auditing.</li>
 * </ul>
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
