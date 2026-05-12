package com.brandon.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * RETO: Estadísticas de Ventas con Streams.
 * 
 * Recibes una lista de objetos 'Venta'. Debes:
 * 1. Agrupar las ventas por su campo 'categoria'.
 * 2. Calcular la suma total de los montos por cada categoría.
 * 3. Devolver un Mapa donde la llave es la categoría y el valor es el total.
 */
public class EstadisticasVentasEnunciado {

    public record Venta(String categoria, double monto) {}

    public Map<String, Double> calcularTotalesPorCategoria(List<Venta> ventas) {
        // TODO: Implementa tu lógica aquí usando Collectors.groupingBy y Collectors.summingDouble
        return null;
    }
}
