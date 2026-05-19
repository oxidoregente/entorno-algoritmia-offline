package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Cliente.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un cliente con nombre. El repositorio asociado deberá buscar
 * clientes por su nombre exacto.</p>
 */
@Entity
public class ClienteEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ClienteEnunciado() {}
    public ClienteEnunciado(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
