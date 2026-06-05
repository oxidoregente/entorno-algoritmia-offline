package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Producto.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un producto vendible en un ecommerce, con su precio y su stock
 * disponible. El repositorio asociado permite encontrar productos
 * "comprables ahora" (con stock) y dentro de un rango de precio.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nombre}: descripción del producto.</li>
 *   <li>{@code precio}: precio unitario ({@link Double}).</li>
 *   <li>{@code stock}: unidades disponibles ({@link Integer}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new ProductoEnunciado("Teclado",  25.0,  3));
 * repository.save(new ProductoEnunciado("Monitor", 200.0,  0));  // sin stock
 * repository.save(new ProductoEnunciado("Ratón",    15.0, 10));
 *
 * // findByPrecioLessThanAndStockGreaterThan(50.0, 0)
 * // -&gt; [Teclado, Ratón]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 *   <li>En producción se preferiría {@code BigDecimal} para el precio.</li>
 * </ul>
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
