package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: FlatMap - Descomponer Pedidos.
 * 
 * <p>Teoría:
 * .flatMap() se usa cuando cada elemento de un stream se transforma en otro stream,
 * y queremos "aplanar" todos esos streams resultantes en uno solo.</p>
 */
public class ProcesadorPedidosSolucion {

    public record Item(String nombre) {}
    public record Pedido(Long id, List<Item> items) {}

    public List<String> obtenerNombresItemsUnicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .flatMap(p -> p.items().stream()) // Transformamos cada pedido en un stream de items
                .map(PedidoEnunciadoItem -> PedidoEnunciadoItem.nombre()) // Suponiendo acceso a nombre
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
