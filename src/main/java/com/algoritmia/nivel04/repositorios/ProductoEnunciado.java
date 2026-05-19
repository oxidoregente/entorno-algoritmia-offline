package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Producto.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un producto con nombre, precio y stock.
 * El repositorio asociado deberá filtrar productos por precio menor a X y stock mayor a 0.</p>
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
