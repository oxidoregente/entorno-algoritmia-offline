package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * SOLUCIÓN: Repositorio de Usuarios Activos.
 */
@Entity
@Table(name = "usuario_solucion")
public class UsuarioSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Boolean activo;
    private LocalDateTime fechaRegistro;

    public UsuarioSolucion() {}
    public UsuarioSolucion(String email, Boolean activo, LocalDateTime fechaRegistro) {
        this.email = email;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
    }
}
