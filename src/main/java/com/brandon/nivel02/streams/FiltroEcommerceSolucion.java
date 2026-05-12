package com.brandon.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * SOLUCIÓN: Filtro de E-commerce con Streams.
 * 
 * <p>Teoría:
 * - .filter(): Filtra elementos basados en un predicado.
 * - .map(): Transforma cada elemento (de Objeto a String en este caso).
 * - .collect(): Reúne los elementos del stream en una colección final.</p>
 */
public class FiltroEcommerceSolucion {

    public record Producto(String nombre, double precio) {}

    public List<String> obtenerNombresConDescuento(List<Producto> productos, double precioMinimo) {
        return productos.stream()
            .filter(p -> p.precio() > precioMinimo)
            .map(p -> p.nombre() + " (Oferta: $" + (p.precio() * 0.9) + ")")
            .collect(Collectors.toList());
    }
}
