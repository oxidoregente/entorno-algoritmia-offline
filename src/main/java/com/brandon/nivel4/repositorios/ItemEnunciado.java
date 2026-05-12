package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;

/**
 * RETO C: Sistema de Inventario.
 * 
 * Modela un item del inventario con su stock y categoría.
 */
@Entity
public class ItemEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Integer stock;
    private String categoria;

    public ItemEnunciado() {}

    public ItemEnunciado(String nombre, Integer stock, String categoria) {
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Integer getStock() { return stock; }
    public String getCategoria() { return categoria; }
}
