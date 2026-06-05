package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Filtro de E-commerce con Streams.
 * <b>Dificultad: Media</b>
 *
 * <p>En cualquier escaparate online (Amazon, Mercado Libre, tu tienda
 * local) existe la sección "Ofertas premium": productos cuyo precio
 * supera cierto umbral y que se muestran con un descuento adicional.
 * Este ejercicio encadena un filtro, un mapeo y un formato de salida en
 * un único pipeline de Streams.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Recibe un {@code List<Producto>} con campos {@code nombre} y
 *       {@code precio}, más un umbral {@code precioMinimo}.</li>
 *   <li>Quedarse SOLO con los productos cuyo {@code precio > precioMinimo}.</li>
 *   <li>Aplicar un 10% de descuento al precio resultante.</li>
 *   <li>Devolver una {@code List<String>} con el formato exacto:
 *       {@code "Nombre (Oferta: $PrecioFinal)"}, donde {@code PrecioFinal}
 *       es el precio con descuento, redondeado a 2 decimales.</li>
 *   <li>Si la lista es {@code null} o ningún producto supera el umbral,
 *       devolver lista vacía.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   productos = [
 *     Producto("Auriculares",  50.0),
 *     Producto("Smart TV",   1500.0),
 *     Producto("Mouse",        25.0),
 *     Producto("Laptop",    2000.0)
 *   ]
 *   precioMinimo = 100.0
 * Salida:
 *   [
 *     "Smart TV (Oferta: $1350.00)",
 *     "Laptop (Oferta: $1800.00)"
 *   ]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Encadena {@code .stream().filter(p -> p.precio() > precioMinimo)}.</li>
 *   <li>Para el descuento usa
 *       {@code .map(p -> p.precio() * 0.9)} antes de formatear.</li>
 *   <li>Para el formato final usa {@code String.format("%.2f", precio)} y
 *       construye el string con {@code String.format(...)} o
 *       {@code formatted(...)}.</li>
 * </ul>
 */
public class FiltroEcommerceEnunciado {

    public record Producto(String nombre, double precio) {}

    /**
     * Filtra los productos cuyo precio supera el umbral, les aplica un
     * 10% de descuento y devuelve un listado formateado.
     *
     * @param productos    lista de productos a evaluar; puede estar vacía.
     * @param precioMinimo precio mínimo (exclusivo) para considerar un
     *                     producto como oferta.
     * @return lista de strings con formato
     *         {@code "Nombre (Oferta: $PrecioFinal)"} para cada producto
     *         que cumple el filtro. Lista vacía si no hay coincidencias.
     */
    public List<String> obtenerNombresConDescuento(List<Producto> productos, double precioMinimo) {
        // TODO: Implementa tu lógica aquí usando la API de Streams
    	
    	List<String> precios = productos.stream()
    			.filter(p -> p.precio > precioMinimo)
    			.map(e-> e.nombre + " (Oferta: $" + e.precio + ")" )
    			.collect(Collectors.toList());
    	
    	System.out.println(precios.toString());
    	
        return precios;
    }
}
