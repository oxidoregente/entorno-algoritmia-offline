package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Item de Inventario.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un artículo de un sistema de inventario (almacén, ecommerce o
 * tienda física). El repositorio asociado debe poder detectar items por
 * agotarse para disparar alertas de reposición.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nombre}: descripción del producto (p. ej. "Camiseta roja M").</li>
 *   <li>{@code stock}: unidades disponibles en almacén ({@link Integer}).</li>
 *   <li>{@code categoria}: agrupación de catálogo (p. ej. "ROPA", "ELECTRONICA").</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new ItemEnunciado("Camiseta roja", 2,  "ROPA"));
 * repository.save(new ItemEnunciado("Pantalón azul", 50, "ROPA"));
 *
 * // findByStockLessThan(5) -&gt; [Camiseta roja]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El stock usa {@code Integer} (no {@code int}) para permitir nulos en BD.</li>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 * </ul>
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
