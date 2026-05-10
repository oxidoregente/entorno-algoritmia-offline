package com.brandon.nivel2.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Nivel 2: Java Funcional y API de Streams.
 * 
 * <p>La API de Streams de Java permite procesar colecciones de datos de forma declarativa,
 * similar a como haríamos consultas en SQL, pero directamente sobre objetos en memoria.</p>
 * 
 * <h3>Conceptos clave:</h3>
 * <ul>
 *   <li><b>Lambdas (->):</b> Son funciones anónimas. Permiten pasar comportamiento como si fuera un dato. 
 *       Estructura: (parámetros) -> { cuerpo }.</li>
 *   <li><b>Streams:</b> Un flujo de datos que no modifica la fuente original, sino que aplica transformaciones.</li>
 *   <li><b>.filter():</b> Filtra elementos basándose en un predicado (condición booleana).</li>
 *   <li><b>.map():</b> Transforma cada elemento del flujo en algo nuevo (ej. de Producto a String).</li>
 *   <li><b>.collect():</b> Es una operación terminal que agrupa el resultado final en una estructura (ej. una Lista).</li>
 * </ul>
 */
public class FiltroEcommerce {

    public record Producto(String nombre, double precio) {}

    /**
     * Filtra productos caros, aplica un descuento y extrae sus nombres.
     * 
     * @param productos Lista original de productos.
     * @param precioMinimo El umbral para filtrar productos.
     * @return Lista de nombres de los productos filtrados con el precio ajustado.
     */
    public List<String> obtenerNombresConDescuento(List<Producto> productos, double precioMinimo) {
        return productos.stream()
            // Paso 1: Filtrar productos que superen el precio mínimo
            .filter(p -> p.precio() > precioMinimo)
            // Paso 2: Aplicar 10% de descuento (simulado aquí devolviendo el nombre con el descuento aplicado)
            .map(p -> p.nombre() + " (Oferta: $" + (p.precio() * 0.9) + ")")
            // Paso 3: Volver a convertir el flujo en una lista real de Java
            .collect(Collectors.toList());
    }
}
