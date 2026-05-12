package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Repositorio de Productos.
 */
@Entity
@Table(name = "producto_solucion")
public class ProductoSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    private Integer stock;

    public ProductoSolucion() {}
    public ProductoSolucion(String nombre, Double precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
