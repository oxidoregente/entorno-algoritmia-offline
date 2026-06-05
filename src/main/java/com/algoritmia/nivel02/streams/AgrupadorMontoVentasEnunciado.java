package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Agrupador de Monto por Moneda.
 * <b>Dificultad: Media</b>
 *
 * <p>En una app de e-commerce o banca con ventas internacionales, cada
 * transacción se realiza en una moneda distinta (USD, EUR, MXN, etc.). Para
 * generar reportes financieros es imprescindible poder agrupar las ventas
 * por moneda y conocer el total acumulado en cada una.</p>
 *
 * <p><b>Reglas / Estructura:</b></p>
 * <ul>
 *   <li>Dado un {@code List<Venta>}, devolver un mapa donde la llave es la
 *       moneda y el valor es la suma de los montos de todas las ventas en
 *       esa moneda.</li>
 *   <li>Si la lista está vacía o es {@code null}, el resultado debe ser un
 *       mapa vacío (no {@code null}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada:
 *   ventas = [
 *     Venta(100.0, "USD"),
 *     Venta(50.0,  "EUR"),
 *     Venta(200.0, "USD"),
 *     Venta(75.0,  "EUR"),
 *     Venta(30.0,  "MXN")
 *   ]
 * Salida:
 *   {
 *     "USD" = 300.0,
 *     "EUR" = 125.0,
 *     "MXN" = 30.0
 *   }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa {@code Collectors.groupingBy(Venta::moneda, Collectors.summingDouble(Venta::monto))}.</li>
 *   <li>Aprovecha el record {@code Venta} para acceder a los campos con
 *       sus métodos accessor generados.</li>
 * </ul>
 */
public class AgrupadorMontoVentasEnunciado {

    public record Venta(double monto, String moneda) {}

    /**
     * Agrupa las ventas por moneda y suma el monto total de cada grupo.
     *
     * @param ventas lista de ventas a procesar; puede estar vacía.
     * @return mapa con la suma total de montos por cada moneda encontrada.
     *         Devuelve un mapa vacío si {@code ventas} es {@code null} o vacía.
     */
    public Map<String, Double> calcularTotalesPorMoneda(List<Venta> ventas) {
        // TODO: Implementa usando groupingBy y summingDouble
        return null;
    }
}
