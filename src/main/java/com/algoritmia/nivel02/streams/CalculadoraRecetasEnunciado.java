package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.Map;

/**
 * 🎓 RETO: Calculadora de Recetas.
 * <b>Dificultad: Media</b>
 *
 * <p>Escala una receta filtrando ingredientes irrelevantes:</p>
 * <ol>
 *   <li>Filtra los ingredientes con cantidad menor a 10 gramos (son irrelevantes para la escala).</li>
 *   <li>Multiplica las cantidades de los ingredientes restantes por el `multiplicador`.</li>
 *   <li>Devuelve un Mapa donde la clave es el nombre del ingrediente y el valor la nueva cantidad escalada.</li>
 * </ol>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Ingredientes: [("sal", 5), ("harina", 200), ("azúcar", 50)]
 * Multiplicador: 2.0
 * Resultado: {"harina": 400.0, "azúcar": 100.0}
 * (La "sal" se filtra por ser menor a 10g)
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Usa `stream()`, `filter()`, `collect(Collectors.toMap(...))`.</li>
 *   <li>Los ingredientes filtrados deben tener cantidad >= 10.</li>
 *   <li>Los valores del mapa son cantidad * multiplicador.</li>
 * </ul>
 */
public class CalculadoraRecetasEnunciado {

    public record Ingrediente(String nombre, double cantidadGramos) {}

    /**
     * Filtra y escala una lista de ingredientes para una receta.
     *
     * @param ingredientes  Lista de ingredientes original.
     * @param multiplicador Factor por el cual multiplicar las cantidades.
     * @return Mapa con nombre del ingrediente y cantidad escalada (ingredientes >= 10g).
     */
    public Map<String, Double> ajustarReceta(List<Ingrediente> ingredientes, double multiplicador) {
        // TODO: Implementa el filtrado y escalado con streams
        return null;
    }
}
