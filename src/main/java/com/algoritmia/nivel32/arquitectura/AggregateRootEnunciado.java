package com.algoritmia.nivel32.arquitectura;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 🎓 RETO: Domain-Driven Design - Aggregate Root Simple.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En DDD, un <b>Aggregate Root</b> es la entidad principal de un cluster
 * de objetos de dominio. Es el único punto de entrada para modificar el
 * estado: cualquier cambio debe pasar por el aggregate root, que se encarga
 * de mantener las invariantes del dominio.</p>
 *
 * <p><b>Conceptos clave:</b></p>
 * <ul>
 *   <li>Aggregate Root: entidad principal que controla el acceso.</li>
 *   <li>Invariantes: reglas de negocio que el aggregate siempre cumple.</li>
 *   <li>Encapsulación: el estado interno no es accesible directamente.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Pedido pedido = new Pedido("P001");
 * pedido.agregarItem("Laptop", 1500.0);
 * pedido.agregarItem("Mouse",   50.0);
 *
 * double total = pedido.calcularTotal(); // 1550.0
 * pedido.confirmar();
 * boolean confirmado = pedido.estaConfirmado(); // true
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El estado es un {@code Map<String, Double>} de items.</li>
 *   <li>El aggregate mantiene la invariante: "un pedido confirmado no acepta más items".</li>
 *   <li>Métodos públicos: {@code agregarItem}, {@code calcularTotal},
 *       {@code confirmar}, {@code estaConfirmado}.</li>
 * </ul>
 */
public class AggregateRootEnunciado {

    /**
     * Aggregate Root: Pedido.
     * Mantiene las invariantes de dominio.
     */
    public static class Pedido {

        private final String id;
        private final Map<String, Double> items = new HashMap<>();
        private boolean confirmado = false;

        public Pedido(String id) {
            this.id = Objects.requireNonNull(id);
        }

        /**
         * Añade un item al pedido.
         * @param nombre Nombre del item.
         * @param precio Precio unitario.
         * @throws IllegalStateException si el pedido ya está confirmado.
         */
        public void agregarItem(String nombre, double precio) {
            // TODO: Implementa respetando la invariante
        }

        /**
         * @return Suma de los precios de todos los items.
         */
        public double calcularTotal() {
            return items.values().stream().mapToDouble(Double::doubleValue).sum();
        }

        /**
         * Cambia el pedido a estado confirmado. No se puede deshacer.
         */
        public void confirmar() {
            // TODO: Implementa
        }

        public String getId() {
            return id;
        }

        public boolean estaConfirmado() {
            return confirmado;
        }

        public Map<String, Double> getItems() {
            return Map.copyOf(items);
        }
    }
}
