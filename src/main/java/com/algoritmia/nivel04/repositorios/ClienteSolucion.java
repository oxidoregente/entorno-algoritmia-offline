package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Entidad Cliente.
 *
 * <p>Entidad JPA que modela un cliente con nombre.
 * La tabla se llama {@code cliente_solucion} para evitar conflictos
 * con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "cliente_solucion")
public class ClienteSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ClienteSolucion() {}
    public ClienteSolucion(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
