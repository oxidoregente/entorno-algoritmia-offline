package com.algoritmia.nivel32.arquitectura;

import java.util.HashMap;
import java.util.Map;

/**
 * 🎓 RETO: Command-Query Separation (CQS).
 * <b>Dificultad: Media</b>
 *
 * <p>CQS es un principio que divide las operaciones de un objeto en dos categorías:
 * <b>Comandos</b> (modifican estado, no retornan valor) y <b>Queries</b>
 * (leen estado, no lo modifican). La separación estricta facilita razonar
 * sobre el código y mejora la testabilidad.</p>
 *
 * <p><b>Conceptos clave:</b></p>
 * <ul>
 *   <li>Comando: método {@code void} que muta el estado.</li>
 *   <li>Query: método que retorna un valor sin mutar el estado.</li>
 *   <li>Separación: un método no debe ser ambos a la vez.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Inventario inv = new Inventario();
 * inv.agregarProducto("Laptop", 10);  // comando
 * inv.agregarProducto("Mouse", 50);   // comando
 *
 * int total = inv.contarProductos();  // query: 2
 * int stockLaptop = inv.stockDe("Laptop"); // query: 10
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El estado interno es un {@code Map<String, Integer>} donde la clave es
 *       el nombre del producto y el valor es el stock.</li>
 *   <li>Comandos: {@code agregarProducto(nombre, cantidad)} y {@code reducirStock(nombre, cantidad)}.</li>
 *   <li>Queries: {@code contarProductos()}, {@code stockDe(nombre)}, {@code listarProductos()}.</li>
 *   <li>Las queries nunca deben modificar el {@code Map} interno.</li>
 * </ul>
 */
public class CqsInventarioEnunciado {

    /**
     * Inventario que aplica CQS: separar comandos (mutan) de queries (leen).
     */
    public static class Inventario {

        private final Map<String, Integer> stock = new HashMap<>();

        // ===== COMANDOS (mutan estado) =====

        /**
         * Añade un nuevo producto o incrementa el stock de uno existente.
         * @param nombre   Nombre del producto.
         * @param cantidad Cantidad a añadir.
         */
        public void agregarProducto(String nombre, int cantidad) {
            // TODO: Implementa el comando
        }

        /**
         * Reduce el stock de un producto (lanza excepción si es insuficiente).
         * @param nombre   Nombre del producto.
         * @param cantidad Cantidad a retirar.
         * @throws IllegalArgumentException si no hay stock suficiente.
         */
        public void reducirStock(String nombre, int cantidad) {
            // TODO: Implementa el comando
        }

        // ===== QUERIES (leen estado, no mutan) =====

        /**
         * @return Cantidad de productos distintos en el inventario.
         */
        public int contarProductos() {
            return stock.size();
        }

        /**
         * @param nombre Nombre del producto.
         * @return Stock actual (0 si no existe).
         */
        public int stockDe(String nombre) {
            return stock.getOrDefault(nombre, 0);
        }

        /**
         * @return Vista inmutable del inventario.
         */
        public Map<String, Integer> listarProductos() {
            return Map.copyOf(stock);
        }
    }
}
