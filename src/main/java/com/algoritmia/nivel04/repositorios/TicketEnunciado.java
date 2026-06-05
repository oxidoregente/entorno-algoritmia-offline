package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Ticket de Soporte.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un ticket de un sistema de soporte (Zendesk, Freshdesk, Jira
 * Service Management...) con su descripción, prioridad y fecha de creación.
 * El repositorio asociado debe servir colas de trabajo priorizadas: "dame los
 * tickets ALTA más recientes".</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code descripcion}: detalle del problema reportado.</li>
 *   <li>{@code prioridad}: cadena con valores {@code "ALTA" | "MEDIA" | "BAJA"}.</li>
 *   <li>{@code fechaCreacion}: se inicializa automáticamente a {@link LocalDateTime#now()} en el constructor.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new TicketEnunciado("Login no funciona",     "ALTA"));
 * repository.save(new TicketEnunciado("Ajustar margen footer", "BAJA"));
 *
 * // findByPrioridadOrderByFechaCreacionDesc("ALTA")
 * // -&gt; tickets ALTA, primero los más recientes
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Idealmente {@code prioridad} debería ser un {@code enum}, pero aquí se usa {@code String} por simplicidad.</li>
 *   <li>La fecha se asigna en el constructor para garantizar que nunca sea nula.</li>
 * </ul>
 */
@Entity
public class TicketEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String prioridad; // "ALTA", "MEDIA", "BAJA"
    private LocalDateTime fechaCreacion;

    public TicketEnunciado() {}
    public TicketEnunciado(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now();
    }
    public Long getId() { return id; }
}
