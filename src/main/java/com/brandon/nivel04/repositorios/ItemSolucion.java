package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN C: Sistema de Inventario.
 */
@Entity
public class ItemSolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer stock;
    private String categoria;

    public ItemSolucion() {}

    public ItemSolucion(String nombre, Integer stock, String categoria) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Long getId() { return id; }
}
