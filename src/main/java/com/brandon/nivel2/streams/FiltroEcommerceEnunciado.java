package com.brandon.nivel2.streams;

import java.util.List;

/**
 * RETO: Filtro de E-commerce con Streams.
 * 
 * Recibes una lista de objetos 'Producto'. Debes:
 * 1. Filtrar los productos cuyo precio sea mayor a 'precioMinimo'.
 * 2. Aplicar un 10% de descuento al precio.
 * 3. Devolver una lista de Strings con el formato: "Nombre (Oferta: $PrecioFinal)".
 */
public class FiltroEcommerceEnunciado {

    public record Producto(String nombre, double precio) {}

    public List<String> obtenerNombresConDescuento(List<Producto> productos, double precioMinimo) {
        // TODO: Implementa tu lógica aquí usando la API de Streams
        return null;
    }
}
