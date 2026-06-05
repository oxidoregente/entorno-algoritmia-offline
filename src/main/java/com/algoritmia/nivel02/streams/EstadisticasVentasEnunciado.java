package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Estadísticas de Ventas con Streams.
 * <b>Dificultad: Media</b>
 *
 * <p>En el backoffice de cualquier tienda o marketplace (Mercado Libre,
 * Amazon, Shopify) el panel de ventas muestra los totales agrupados por
 * categoría (Electrónica, Ropa, Hogar, etc.). Este ejercicio replica esa
 * consulta con Streams y un collector doble.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Recibe un {@code List<Venta>} con campos {@code categoria} y
 *       {@code monto}.</li>
 *   <li>Debe devolver un {@code Map<String, Double>} donde la llave es
 *       la categoría y el valor es la SUMA total de los montos vendidos
 *       en esa categoría.</li>
 *   <li>Si la lista está vacía o es {@code null}, el resultado debe ser
 *       un mapa vacío.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   ventas = [
 *     Venta("Electrónica", 1500.0),
 *     Venta("Ropa",         300.0),
 *     Venta("Electrónica",  500.0),
 *     Venta("Hogar",        800.0),
 *     Venta("Ropa",         450.0)
 *   ]
 * Salida:
 *   {
 *     "Electrónica" = 2000.0,
 *     "Ropa"        =  750.0,
 *     "Hogar"       =  800.0
 *   }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code Collectors.groupingBy(Venta::categoria, Collectors.summingDouble(Venta::monto))}.</li>
 *   <li>Recuerda que el record {@code Venta} genera automáticamente los
 *       accessors {@code categoria()} y {@code monto()}.</li>
 * </ul>
 */
public class EstadisticasVentasEnunciado {

	public record Venta(String categoria, double monto) {
	}

    /**
     * Agrupa las ventas por categoría y suma el monto total de cada grupo.
     *
     * @param ventas lista de ventas a procesar; puede estar vacía.
     * @return mapa con la suma total de montos por cada categoría.
     *         Devuelve un mapa vacío si la lista es {@code null} o vacía.
     */
	public Map<String, Double> calcularTotalesPorCategoria(List<Venta> ventas) {
		// TODO: Implementa tu lógica aquí usando Collectors.groupingBy y
		// Collectors.summingDouble

		Map<String, Double> mapa = ventas.stream()
				.collect(Collectors.groupingBy(Venta::categoria, Collectors.summingDouble(Venta::monto)));

		return mapa;
	}
}
