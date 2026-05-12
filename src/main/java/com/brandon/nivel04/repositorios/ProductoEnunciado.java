package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Repositorio de Productos.
 * 
 * Implementa un Query Method avanzado.
 */
@Entity
public class ProductoEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;

    public ProductoEnunciado() {}
    public ProductoEnunciado(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Double getPrecio() { return precio; }
    public Integer getStock() { return stock; }
}
