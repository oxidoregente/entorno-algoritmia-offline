package com.algoritmia.nivel06.dto;

/**
 * 🎓 RETO: Record Producto DTO.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Crea un Java {@code record} para transportar datos de productos de forma
 * inmutable y segura entre las capas de la aplicación (por ejemplo, entre
 * el controlador y el cliente de la API REST).</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>{@code codigo}: identificador único del producto ({@link String}).</li>
 *   <li>{@code nombre}: descripción legible del producto ({@link String}).</li>
 *   <li>{@code precioPublico}: precio de venta al público ({@link Double}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public record ProductoDTOEnunciado(String codigo, String nombre, Double precioPublico) {}
 *
 * ProductoDTOEnunciado p = new ProductoDTOEnunciado("P001", "Laptop", 999.99);
 * System.out.println(p.nombre());        // "Laptop"
 * System.out.println(p.precioPublico()); // 999.99
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Los {@code record} generan automáticamente constructor, getters, {@code equals()},
 *       {@code hashCode()} y {@code toString()}.</li>
 *   <li>En producción se preferiría {@code BigDecimal} para el precio para evitar
 *       problemas de redondeo con tipos de coma flotante.</li>
 * </ul>
 */
// TODO: Crea el Record aquí (reemplaza la clase con un record de Java)
public class ProductoDTOEnunciado {
}
