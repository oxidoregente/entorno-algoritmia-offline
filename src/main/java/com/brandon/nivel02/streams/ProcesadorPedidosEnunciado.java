package com.brandon.nivel02.streams;

import java.util.List;

/**
 * RETO: FlatMap - Descomponer Pedidos.
 * 
 * Recibes una lista de 'Pedido', donde cada pedido tiene una lista de 'Item'.
 * Debes obtener una lista única (plana) con los nombres de TODOS los items
 * de todos los pedidos, sin duplicados y ordenados alfabéticamente.
 */
public class ProcesadorPedidosEnunciado {

    public record Item(String nombre) {}
    public record Pedido(Long id, List<Item> items) {}

    public List<String> obtenerNombresItemsUnicos(List<Pedido> pedidos) {
        // TODO: Implementa tu lógica aquí usando .flatMap()
        return null;
    }
}
