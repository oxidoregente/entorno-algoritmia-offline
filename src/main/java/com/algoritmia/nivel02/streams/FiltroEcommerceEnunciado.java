package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Filtro de E-commerce con Streams.
 * <b>Dificultad: Media</b>
 * 
 * <p>Recibes una lista de objetos 'Producto'. Debes:</p>
 * <ol>
 *   <li>Filtrar los productos cuyo precio sea mayor a 'precioMinimo'.</li>
 *   <li>Aplicar un 10% de descuento al precio.</li>
 *   <li>Devolver una lista de Strings con el formato: "Nombre (Oferta: $PrecioFinal)".</li>
 * </ol>
 */
public class FiltroEcommerceEnunciado {

    public record Producto(String nombre, double precio) {}

    public List<String> obtenerNombresConDescuento(List<Producto> productos, double precioMinimo) {
        // TODO: Implementa tu lógica aquí usando la API de Streams
        return null;
    }
}
