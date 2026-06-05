package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Usuario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un usuario de cualquier SaaS con email, flag de actividad y fecha
 * de alta. El repositorio asociado servirá para campañas de marketing del
 * tipo "usuarios nuevos y activos" (registrados después de una fecha
 * concreta y aún activos).</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code email}: correo del usuario (idealmente único en producción).</li>
 *   <li>{@code activo}: booleano que indica si la cuenta sigue habilitada.</li>
 *   <li>{@code fechaRegistro}: timestamp del alta ({@link LocalDateTime}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new UsuarioEnunciado("ana@x.com",  true,  LocalDateTime.now()));
 * repository.save(new UsuarioEnunciado("luis@x.com", false, LocalDateTime.now().minusDays(30)));
 *
 * // findByActivoTrueAndFechaRegistroAfter(haceUnaSemana) -&gt; [ana]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@link Boolean} (no {@code boolean}) para permitir nulos si fuera necesario.</li>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 * </ul>
 */
@Entity
public class UsuarioEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Boolean activo;
    private LocalDateTime fechaRegistro;

    public UsuarioEnunciado() {}
    public UsuarioEnunciado(String email, Boolean activo, LocalDateTime fechaRegistro) {
        this.email = email;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
    }
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public Boolean getActivo() { return activo; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
}
