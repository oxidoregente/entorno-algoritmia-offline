package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Item de Inventario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un item del inventario con nombre, stock y categoría.
 * El repositorio asociado deberá buscar items con stock menor a un valor dado (agotados).</p>
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
