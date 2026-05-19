package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Estadísticas de Ventas con Streams.
 * <b>Dificultad: Media</b>
 * 
 * <p>Recibes una lista de objetos 'Venta'. Debes:</p>
 * <ol>
 *   <li>Agrupar las ventas por su campo 'categoria'.</li>
 *   <li>Calcular la suma total de los montos por cada categoría.</li>
 *   <li>Devolver un Mapa donde la llave es la categoría y el valor es el total.</li>
 * </ol>
 */
public class EstadisticasVentasEnunciado {

    public record Venta(String categoria, double monto) {}

    public Map<String, Double> calcularTotalesPorCategoria(List<Venta> ventas) {
        // TODO: Implementa tu lógica aquí usando Collectors.groupingBy y Collectors.summingDouble
        return null;
    }
}
