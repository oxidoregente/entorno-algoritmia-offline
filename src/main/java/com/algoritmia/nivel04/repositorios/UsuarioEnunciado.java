package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Usuario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un usuario del sistema con email, estado de actividad y fecha de registro.
 * El repositorio asociado deberá consultar usuarios activos registrados después de una fecha.</p>
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
