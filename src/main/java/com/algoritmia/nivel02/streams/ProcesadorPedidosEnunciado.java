package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: FlatMap - Descomponer Pedidos.
 * <b>Dificultad: Media</b>
 *
 * <p>Recibes una lista de `Pedido`, donde cada pedido contiene una lista de `Item`.
 * Debes obtener una lista plana con los nombres de todos los items de todos los pedidos,
 * sin duplicados y ordenados alfabéticamente.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Pedido 1: items = ["laptop", "mouse"]
 * Pedido 2: items = ["monitor", "laptop", "teclado"]
 * Salida: ["laptop", "monitor", "mouse", "teclado"]
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `flatMap()` para aplanar las listas de items de cada pedido en un solo stream.</li>
 *   <li>Encadena `.map()`, `.distinct()` y `.sorted()` para completar el pipeline.</li>
 * </ul>
 */
public class ProcesadorPedidosEnunciado {

    public record Item(String nombre) {}
    public record Pedido(Long id, List<Item> items) {}

    /**
     * Obtiene una lista de nombres de items únicos de todos los pedidos, ordenados alfabéticamente.
     *
     * @param pedidos Lista de pedidos, cada uno con su propia lista de items.
     * @return Lista de nombres de items sin duplicados y ordenados.
     */
    public List<String> obtenerNombresItemsUnicos(List<Pedido> pedidos) {
        // TODO: Implementa usando flatMap, distinct y sorted
        return null;
    }
}
